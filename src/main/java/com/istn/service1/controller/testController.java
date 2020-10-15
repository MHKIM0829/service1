package com.istn.service1.controller;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class testController {


    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public ResponseEntity<?> TenUnderTransfer(@RequestBody Map<String, Object> requestBody) throws JsonProcessingException {

        Map<String, String> resMap = new HashMap<String, String>();
        resMap.put("type", "First eureka client!");
        resMap.put("message", "Spring Cloud is awesome!");
        
        return ResponseEntity.status(HttpStatus.OK).body(resMap);
        
    }
}
