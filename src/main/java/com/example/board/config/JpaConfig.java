package com.example.board.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration // 설정 파일에 대한것이 들어감
@EnableJpaAuditing // JPA에 대해서 감시 활성화 시킴
public class JpaConfig {
}
