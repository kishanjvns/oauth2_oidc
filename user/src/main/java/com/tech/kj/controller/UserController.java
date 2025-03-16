package com.tech.kj.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @GetMapping
    public ResponseEntity<String> helloWorld(){
        LOGGER.info("Controller {}.{} invoked",this.getClass().getName(),"helloWorld");
        return ResponseEntity.ok("Hello world");
    }

    @PutMapping("/updateContact")
    public ResponseEntity<String> updateContact(@RequestBody Map<String,String> requestDto) {
        LOGGER.info("Controller {}.{} with param {} invoked",this.getClass().getName(),"updateContact",requestDto);
        return ResponseEntity.ok("Successfully updated!!!");
    }

    @PutMapping("/subscribe")
    public ResponseEntity<String> subscribeChannel(@RequestBody Map<String,String> requestDto) {
        LOGGER.info("Controller {}.{} with param {} invoked",this.getClass().getName(),"subscribeChannel",requestDto);
        return ResponseEntity.ok("Successfully updated!!!");
    }

    @PostMapping("/addComment")
    public ResponseEntity<String> addComment(@RequestBody Map<String,String> requestDto) {
        LOGGER.info("Controller {}.{} with param {} invoked",this.getClass().getName(),"subscribeChannel",requestDto);
        return ResponseEntity.ok("Successfully updated!!!");
    }

}
