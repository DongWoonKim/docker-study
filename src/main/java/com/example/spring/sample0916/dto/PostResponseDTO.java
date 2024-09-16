package com.example.spring.sample0916.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
public class PostResponseDTO {

    private String title;
    private String content;

    @Builder
    public PostResponseDTO(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
