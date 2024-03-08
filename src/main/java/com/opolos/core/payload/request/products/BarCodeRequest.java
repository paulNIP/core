package com.opolos.core.payload.request.products;

import jakarta.validation.constraints.NotBlank;


public class BarCodeRequest {

  @NotBlank

  private String company;

  @NotBlank
  private String number_of_barcodes;

public String getCompany() {
    return company;
}

public void setCompany(String company) {
    this.company = company;
}

public String getNumber_of_barcodes() {
    return number_of_barcodes;
}

public void setNumber_of_barcodes(String number_of_barcodes) {
    this.number_of_barcodes = number_of_barcodes;
}

}
    

