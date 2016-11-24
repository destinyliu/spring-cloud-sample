package me.destinyshine.scshop.users.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author destinyliu
 */
@RestController
public class AuthenticationController {

    @RequestMapping(path = "/authentications", method = RequestMethod.POST)
    public void creat() {

    }
}
