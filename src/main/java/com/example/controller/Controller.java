package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.Service;
@RestController
public class Controller { 
	

	@Autowired
    private Service conversionService;

    @PostMapping("/jsontoxml")
    public ResponseEntity<String> convertJsonToXml(@RequestBody String jsonPayload) {
        try {
            String xmlPayload = conversionService.convertJsonToXml(jsonPayload);
            return ResponseEntity.ok(xmlPayload);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error converting JSON to XML");
        }
    }
}

