package com.example.demo.service;

import com.example.demo.utils.NaverApi;
import org.springframework.stereotype.Service;

@Service
public class searchService {
    public static String blogSearch(String keyword)
    {
        return NaverApi.blogSearch(keyword);
    }
}
