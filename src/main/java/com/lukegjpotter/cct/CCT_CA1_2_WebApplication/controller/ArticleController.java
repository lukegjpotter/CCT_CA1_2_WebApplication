package com.lukegjpotter.cct.CCT_CA1_2_WebApplication.controller;

import com.lukegjpotter.cct.CCT_CA1_2_WebApplication.dto.ArticleDto;
import com.lukegjpotter.cct.CCT_CA1_2_WebApplication.service.ArticleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleController {

    private final Logger logger = LoggerFactory.getLogger(ArticleController.class);
    @Autowired
    private ArticleService articleService;

    @GetMapping("/api/articles")
    public ResponseEntity<List<ArticleDto>> getArticles() {
        logger.debug("Retrieving all articles");
        return ResponseEntity.ok(articleService.getAllArticles());
    }

    @PostMapping("/api/articles")
    public ResponseEntity<List<ArticleDto>> getArticlesByTitle(String title) {
        logger.debug("Retrieving articles by title: {}", title);
        return ResponseEntity.ok(articleService.getArticlesByTitle(title));
    }
}
