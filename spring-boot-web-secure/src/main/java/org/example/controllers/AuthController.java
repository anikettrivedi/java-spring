package org.example.controllers;

import com.fasterxml.jackson.databind.util.JSONWrappedObject;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
@Slf4j
public class AuthController {

    @GetMapping(
            value = "/test",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public String test(){
        log.info("test request triggered");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("timestamp", System.currentTimeMillis() + " xyz abc");
        return jsonObject.toString();
    }

}
