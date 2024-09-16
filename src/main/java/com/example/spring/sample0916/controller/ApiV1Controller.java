package com.example.spring.sample0916.controller;

import com.example.spring.sample0916.dto.PostResponseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class ApiV1Controller {

    @GetMapping("/posts")
    public List<PostResponseDTO> getPosts() {
        return List.of(
                PostResponseDTO.builder()
                        .title("제목1")
                        .content("내용1")
                        .build(),
                PostResponseDTO.builder()
                        .title("제목2")
                        .content("내용2")
                        .build()
        );
    }

}
