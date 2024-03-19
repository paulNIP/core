package com.opolos.core;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.opolos.core.security.services.FilesStorageService;

import jakarta.annotation.Resource;

@SpringBootApplication
public class CoreApplication implements CommandLineRunner {

	@Resource
    FilesStorageService storageService;

	public static void main(String[] args) {
		SpringApplication.run(CoreApplication.class, args);
	}

	@Override
	public void run(String... arg) throws Exception {
  //    storageService.deleteAll();
	  storageService.init();
	}

}
