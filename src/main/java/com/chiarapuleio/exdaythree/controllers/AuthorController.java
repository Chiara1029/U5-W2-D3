package com.chiarapuleio.exdaythree.controllers;

import com.chiarapuleio.exdaythree.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    @Autowired
    private AuthorService authSrv;
}
