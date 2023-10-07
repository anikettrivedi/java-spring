package org.example.controllers;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.entity.UserRole;
import org.example.repository.UserRolesRepository;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("auth")
@Slf4j
@AllArgsConstructor
public class AuthController {

    private final UserRolesRepository userRolesRepository;

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

    @GetMapping(
            value = "/roles"
    )
    public List<UserRole> getRoles(){
        return userRolesRepository.findAll();
    }

}
