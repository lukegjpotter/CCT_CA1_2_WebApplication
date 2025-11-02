package com.lukegjpotter.cct.CCT_CA1_2_WebApplication.service;

import com.lukegjpotter.cct.CCT_CA1_2_WebApplication.dto.ArticleDto;
import com.lukegjpotter.cct.CCT_CA1_2_WebApplication.model.Article;
import com.lukegjpotter.cct.CCT_CA1_2_WebApplication.repository.ArticleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    private final Logger logger = LoggerFactory.getLogger(ArticleService.class);
    @Autowired
    private ArticleRepository articleRepository;

    public List<ArticleDto> getAllArticles() {
        logger.debug("Retrieving all articles");
        return articleRepository.findAll().stream().map(Article::toDto).toList();
    }

    public List<ArticleDto> getArticlesByTitle(String title) {
        logger.debug("Retrieving articles by title: {}", title);
        return articleRepository.findByTitle(title).stream().map(Article::toDto).toList();
    }
}
