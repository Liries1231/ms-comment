package com.example.mscomment.client.cfg;
import com.example.ms_comment.dto.model.CommentDto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.mscomment.client.repository.CommentRepository;

@Service
@AllArgsConstructor
public class CommentClient {

    private final CommentRepository commentRepository;



    public CommentDto saveComment(CommentDto comment) {
        return commentRepository.save(comment);
    }
}
