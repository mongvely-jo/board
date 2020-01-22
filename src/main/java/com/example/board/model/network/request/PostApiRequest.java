package com.example.board.model.network.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostApiRequest {

    private Long id;

    private String title;

    private String content;

    private String type;

    private Long userId;

    private Long boardId;

}
