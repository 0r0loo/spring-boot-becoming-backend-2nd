package com.blue.springbookbasic.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity // 엔티티로 지정
@Getter // 게터 자동 생성
@NoArgsConstructor // 기본 생성자 자동 생성
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    // 빌더 패턴으로 객체 생성
    @Builder
    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }


    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }

}
