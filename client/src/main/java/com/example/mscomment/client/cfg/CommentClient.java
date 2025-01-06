package com.example.mscomment.client.cfg;
import com.example.ms_comment.dto.CommentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.mscomment.client.repository.CommentRepository;

@Service
public class CommentClient {

    private final CommentRepository commentRepository;

    @Autowired
    public CommentClient(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }


    public CommentDto saveComment(CommentDto comment) {
        return commentRepository.save(comment);
    }
}