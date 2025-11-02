package com.lukegjpotter.cct.CCT_CA1_2_WebApplication.controller;

import com.lukegjpotter.cct.CCT_CA1_2_WebApplication.dto.ArticleDto;
import com.lukegjpotter.cct.CCT_CA1_2_WebApplication.service.ArticleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleController {

    private Logger logger = LoggerFactory.getLogger(ArticleController.class);
    @Autowired
    private ArticleService articleService;

    @GetMapping("/articles")
    public ResponseEntity<List<ArticleDto>> getArticles() {
        return ResponseEntity.ok(articleService.getAllArticles());
    }
}
