package com.example.ms.comment;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {
    private Long postId;
    private Long userId;
    private String text;


}

