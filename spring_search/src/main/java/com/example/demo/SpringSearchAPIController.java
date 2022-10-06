package com.example.demo;

import com.example.demo.service.searchService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SpringSearchAPIController {
    @GetMapping("/api/v1/blogmenu")
    public ResponseEntity<String> getSearch(@RequestParam String keyword) {
        String json = searchService.blogSearch(keyword);
        return new ResponseEntity<String>(json, HttpStatus.OK);
    }
}