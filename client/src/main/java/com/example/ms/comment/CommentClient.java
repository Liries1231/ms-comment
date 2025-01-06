package com.example.ms.comment;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class CommentClient {

    private final WebClient webClient;

    public CommentClient(WebClient.Builder webClientBuilder) {
        String commentServiceUrl = "http://localhost:8083";
        this.webClient = webClientBuilder.baseUrl(commentServiceUrl).build();
    }

    public Mono<CommentDto> createComment(CommentDto comment, String userId) {
        return webClient.post()
                .uri("/comments")
                .header("X-User-Id", userId)  // Передаем userId как заголовок
                .bodyValue(comment)
                .retrieve()
                .bodyToMono(CommentDto.class);
    }


}
