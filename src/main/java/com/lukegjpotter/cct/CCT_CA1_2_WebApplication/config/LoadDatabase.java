package com.lukegjpotter.cct.CCT_CA1_2_WebApplication.config;

import com.lukegjpotter.cct.CCT_CA1_2_WebApplication.model.Article;
import com.lukegjpotter.cct.CCT_CA1_2_WebApplication.repository.ArticleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabaseWithArticles(ArticleRepository repository) {

        return args -> {
            if (repository.findAll().isEmpty()) {
                log.info("Preloading {}", repository.saveAll(List.of(
                        new Article("Pokémon Red and Blue", "A review of the 1998 game"),
                        new Article("Pokémon Gold and Silver", "A review of the 2000 game"),
                        new Article("Pokémon Ruby and Sapphire", "A review of the 2003 game"),
                        new Article("Pokémon Diamond and Pearl", "A review of the 2007 game"),
                        new Article("Pokémon Black and White", "A review of the 2011 game"),
                        new Article("Pokémon X and Y", "A review of the 2013 game"),
                        new Article("Pokémon Sun and Moon", "A review of the 2016 game"),
                        new Article("Pokémon Sword and Shield", "A review of the 2019 game"),
                        new Article("Pokémon Legends: Arceus", "A review of the 2022 game"),
                        new Article("Pokémon Scarlet and Violet", "A review of the 2022 game"),
                        new Article("Pokémon Legends Z-A", "A review of the 2025 game"))));
            }
        };
    }
}
