package com.example.usermicroservice.resources;

import com.example.usermicroservice.models.User;
import com.example.usermicroservice.models.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserResource {

    private String activity_microservice_uri = "http://activitymicroservice";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET, produces = {"application/json"})
    public User getUser(@PathVariable("userId") String userId){


        List<UserInfo> userinfo = Arrays.asList(restTemplate.getForObject(activity_microservice_uri+"/userInfo/"+ userId, UserInfo.class));
        return new User(userId, "Muinde Geofrey", userinfo);
    }

    @GetMapping("/test")
    public String test(){


        return "Healthy";
    }
}
