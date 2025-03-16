package com.tech.kj.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/comment")
public class CommentController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CommentController.class);

    @GetMapping("/findAllCommentBy/{userName}")
    public ResponseEntity<List<String>> findAllCommentByUser(@RequestParam String userName) {
        LOGGER.info("Controller {}.{} invoked", this.getClass().getName(), "findAllCommentByUser");
        return ResponseEntity.ok(List.of("NeedCode", "Leetcode", "In28Minutes"));
    }

    @PutMapping("/modifyComment/{userName}")
    public ResponseEntity<Map<String, String>> modifyComment(@RequestBody Map<String,String> requestDto) {
        LOGGER.info("Controller {}.{} with param {} invoked", this.getClass().getName(), "modifyComment", requestDto);
        return ResponseEntity.ok(Map.of("name", "NeetCode", "ownBy", "Mack", "totalVideos", "80", "totalSubscriber", "100"));
    }

    @PostMapping("/createComment")
    public ResponseEntity<String> createComment(@RequestBody Map<String,String> requestDto) {
        LOGGER.info("Controller {}.{} with param {} invoked", this.getClass().getName(), "createComment", requestDto);
        return ResponseEntity.ok("Successfully updated!!!");
    }
    @DeleteMapping("/deleteCommentBy/{userName}/{commentId}")
    public ResponseEntity<String>  deleteCommentByIdAndUserName() {
        LOGGER.info("Controller {}.{} invoked", this.getClass().getName(), "createComment");
        return ResponseEntity.ok("Successfully updated!!!");
    }
}
