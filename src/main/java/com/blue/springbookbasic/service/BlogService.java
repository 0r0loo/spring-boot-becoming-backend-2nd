package com.blue.springbookbasic.service;

import com.blue.springbookbasic.domain.Article;
import com.blue.springbookbasic.dto.AddArticleRequest;
import com.blue.springbookbasic.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor // final 이 붙거나 @NonNull 인 필드만 파라미터로 받는 생성자를 만들어줌
@Service // 서비스 빈으로 등록
public class BlogService {

    private final BlogRepository blogRepository;

    // 블로그 글 추가 메서드
    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}
