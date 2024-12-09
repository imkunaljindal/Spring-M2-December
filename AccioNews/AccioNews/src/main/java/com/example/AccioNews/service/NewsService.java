package com.example.AccioNews.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {

    RestTemplate restTemplate = new RestTemplate();

    public Object getNews(String apiKey) {
        String url = "https://newsapi.org/v2/top-headlines?country=us&apiKey="+apiKey;
        Object response = restTemplate.getForObject(url, Object.class);
        return response;
    }
}