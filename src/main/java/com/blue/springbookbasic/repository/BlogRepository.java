package com.blue.springbookbasic.repository;

import com.blue.springbookbasic.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
