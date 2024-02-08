package com.example.util;

import com.fasterxml.jackson.databind.JsonNode;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Util {
	
	private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final XmlMapper xmlMapper = new XmlMapper();

    public static String convertJsonToXml(String jsonPayload) throws Exception {
        // Parse JSON to JsonNode
        JsonNode jsonNode = objectMapper.readTree(jsonPayload);

        // Convert JsonNode to XML string
        String xmlPayload = xmlMapper.writer().with(SerializationFeature.WRAP_ROOT_VALUE).writeValueAsString(jsonNode);

        return xmlPayload;
    }

}
