package com.lukegjpotter.cct.CCT_CA1_2_WebApplication.repository;

import com.lukegjpotter.cct.CCT_CA1_2_WebApplication.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Transactional(readOnly = true)
public interface ArticleRepository extends JpaRepository<Article, UUID> {

    List<Article> findByTitleContainingIgnoreCase(String searchTerm);
}
