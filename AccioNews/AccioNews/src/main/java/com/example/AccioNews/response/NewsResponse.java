package com.example.AccioNews.response;


import java.util.List;


public class NewsResponse {
    int totalResults;
    List<Article> articles;

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public NewsResponse() {
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }
}
