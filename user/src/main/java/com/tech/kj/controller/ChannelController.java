package com.tech.kj.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/channel")
public class ChannelController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChannelController.class);
    @GetMapping("/listAll")
    public ResponseEntity<List<String>> listAllChannel() {
        LOGGER.info("Controller {}.{} invoked", this.getClass().getName(), "listAllChannel");
        return ResponseEntity.ok(List.of("NeedCode", "Leetcode", "In28Minutes"));
    }

    @GetMapping("/fetchBy/{name}")
    public ResponseEntity<Map<String, String>> fetchByName(@RequestParam String name) {
        LOGGER.info("Controller {}.{} with param {} invoked", this.getClass().getName(), "createChannel", name);
        return ResponseEntity.ok(Map.of("name", "NeetCode", "ownBy", "Mack", "totalVideos", "80", "totalSubscriber", "100"));
    }

    @PostMapping("/createChannel")
    public ResponseEntity<String> createChannel(@RequestBody Map<String, String> requestDto) {
        LOGGER.info("Controller {}.{} with param {} invoked", this.getClass().getName(), "createChannel", requestDto);
        return ResponseEntity.ok("Successfully updated!!!");
    }

}
