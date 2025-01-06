package com.example.ms.comment.controller;


import com.example.ms.comment.CommentClient;
import com.example.ms.comment.CommentDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/comments")
@Slf4j
public class CommentController {

    private final CommentClient commentClient;

    public CommentController(CommentClient commentClient) {
        this.commentClient = commentClient;
    }

    @PostMapping
    public Mono<ResponseEntity<CommentDto>> createComment(
            @RequestBody CommentDto comment,
            @RequestHeader("X-User-Id") String userId) {

        comment.setUserId(Long.parseLong(userId));
        log.info("User ID from header: {}", userId);
        return commentClient.createComment(comment,userId)
                .map(savedComment -> ResponseEntity.status(HttpStatus.CREATED).body(savedComment))
                .defaultIfEmpty(ResponseEntity.status(HttpStatus.BAD_REQUEST).build());
    }
}

