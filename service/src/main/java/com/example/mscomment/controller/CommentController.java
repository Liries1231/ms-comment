package com.example.mscomment.controller;


import com.example.ms_comment.dto.CommentDto;
import com.example.mscomment.client.cfg.CommentClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/comments")
public class CommentController {

    private final CommentClient commentService;

    public CommentController(CommentClient commentService) {
        this.commentService = commentService;
    }


    @PostMapping
    public ResponseEntity<CommentDto> createComment(
            @RequestBody CommentDto comment,
            @RequestHeader("X-User-Id") String userId) {

        comment.setUserId(Long.parseLong(userId));

        CommentDto savedComment = commentService.saveComment(comment);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedComment);
    }
}

