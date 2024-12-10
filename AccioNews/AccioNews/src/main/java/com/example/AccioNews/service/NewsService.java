package com.example.AccioNews.service;

import com.example.AccioNews.response.NewsResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {

    RestTemplate restTemplate = new RestTemplate();

    public NewsResponse getNews(String apiKey) {
        String url = "https://newsapi.org/v2/top-headlines?country=us&apiKey="+apiKey;
        NewsResponse response = restTemplate.getForObject(url, NewsResponse.class);
        return response;
    }
}