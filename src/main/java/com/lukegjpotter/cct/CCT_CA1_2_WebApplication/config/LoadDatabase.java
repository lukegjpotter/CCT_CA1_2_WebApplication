package com.lukegjpotter.cct.CCT_CA1_2_WebApplication.config;

import com.lukegjpotter.cct.CCT_CA1_2_WebApplication.model.Article;
import com.lukegjpotter.cct.CCT_CA1_2_WebApplication.repository.ArticleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabaseWithArticles(ArticleRepository repository) {

        return args -> {
            if (repository.count() == 0) {
                log.info("Preloading {}", repository.save(new Article("Pokémon Red and Blue", "A review of the 1996 game")));
                log.info("Preloading {}", repository.save(new Article("Pokémon Gold and Silver", "A review of the 1999 game")));
                log.info("Preloading {}", repository.save(new Article("Pokémon Legends Z-A", "A review of the 2025 game")));
            }
        };
    }
}
