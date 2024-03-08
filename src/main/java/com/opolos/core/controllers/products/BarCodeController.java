package com.opolos.core.controllers.products;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.opolos.core.models.Role;
import com.opolos.core.models.User;
import com.opolos.core.models.products.BarCode;
import com.opolos.core.payload.request.LoginRequest;
import com.opolos.core.payload.request.SignupRequest;
import com.opolos.core.payload.request.products.BarCodeRequest;
import com.opolos.core.payload.response.JwtResponse;
import com.opolos.core.payload.response.MessageResponse;
import com.opolos.core.repository.RoleRepository;
import com.opolos.core.repository.UserRepository;
import com.opolos.core.security.jwt.JwtUtils;
import com.opolos.core.security.services.UserDetailsImpl;
import java.util.UUID;
import com.opolos.core.repository.products.BarCodeRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/products")
public class BarCodeController {
  @Autowired
  AuthenticationManager authenticationManager;

  @Autowired
  UserRepository userRepository;

  @Autowired
  RoleRepository roleRepository;

  @Autowired
  PasswordEncoder encoder;

  @Autowired
  JwtUtils jwtUtils;

  @Autowired
  BarCodeRepository barCodeRepository;

  @PostMapping("/signin")
  public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

    Authentication authentication = authenticationManager.authenticate(
        new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

    SecurityContextHolder.getContext().setAuthentication(authentication);
    String jwt = jwtUtils.generateJwtToken(authentication);
    
    UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();    
    List<String> roles = userDetails.getAuthorities().stream()
        .map(item -> item.getAuthority())
        .collect(Collectors.toList());

    return ResponseEntity.ok(new JwtResponse(jwt, 
                         userDetails.getId(), 
                         userDetails.getUsername(), 
                         userDetails.getEmail(), 
                         roles));
  }

  @PostMapping("/create-barcodes")
  public ResponseEntity<?> createBarCodes(@Valid @RequestBody BarCodeRequest barCodeRequest) {

    int barcodeNo =Integer.parseInt(barCodeRequest.getNumber_of_barcodes());
    for(int i=0;i<barcodeNo;i++){
      UUID uuid = UUID.randomUUID();
      String uuidAsString = uuid.toString();
      BarCode barcode =new BarCode(
        uuidAsString,
        barCodeRequest.getCompany(),
        null,
        LocalDateTime.now().toString(),
        null
      );
      barCodeRepository.save(barcode);

    }



    return ResponseEntity.ok(new MessageResponse("Bar Codes Inserted successfully!"));
  }
}

