package com.example.ms.comment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.xml.stream.events.Comment;
import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<CommentDto, Long> {
    List<Comment> findByPostId(Long postId);
}

