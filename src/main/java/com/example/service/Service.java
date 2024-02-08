package com.example.service;

import java.io.IOException;

import com.example.util.Util;


public class Service {
	
	public String convertJsonToXml(String jsonPayload) {
        try {
            // Use a utility method from the Util class for conversion
            String xmlPayload = Util.convertJsonToXml(jsonPayload);
            return xmlPayload;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error converting JSON to XML", e);
        }
    }
	
}
