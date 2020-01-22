package com.example.board.model.network.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostApiResponse {

    private Long id;

    private String title;

    private String content;

    private String type;

    private Long userId;

    private Long boardId;

}
