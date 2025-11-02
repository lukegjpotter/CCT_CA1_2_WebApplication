package com.lukegjpotter.cct.CCT_CA1_2_WebApplication.model;

import com.lukegjpotter.cct.CCT_CA1_2_WebApplication.dto.ArticleDto;
import jakarta.persistence.*;

import java.util.Objects;
import java.util.UUID;

@Entity
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String title;
    private String summary;
    @Version
    private long version;

    /**
     * Empty constructor for JPA.
     */
    public Article() {
    }

    public Article(String title, String summary) {
        this.title = title;
        this.summary = summary;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Objects.equals(getId(), article.getId()) && Objects.equals(getTitle(), article.getTitle()) && Objects.equals(getSummary(), article.getSummary());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getSummary());
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                '}';
    }

    public ArticleDto toDto() {
        return new ArticleDto(title, summary);
    }
}
