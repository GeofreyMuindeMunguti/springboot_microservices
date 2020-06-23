package com.example.activityservice.resources;

import com.example.activityservice.models.UserInfo;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Path;

@RestController
@RequestMapping("/userInfo")
public class UserInfoResource {

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET, produces = {"application/json"})
    public UserInfo getUserInfo(@PathVariable("userId") String userId) {
        System.out.println("Called");
        return new UserInfo(userId, "Tall dark and handsome");
    }
    @GetMapping("/test")
    public String test(){
        return "Healthy too";
    }

}
