package com.searchbackend.api;

import com.searchbackend.services.SearchService;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/suggest")
public class SuggestController {

    private final SearchService searchService;

    public SuggestController(SearchService searchService) {
        this.searchService = searchService;
    }

    @GetMapping
    public List<String> suggest(@RequestParam String keyword) throws IOException {
        return searchService.suggest(keyword);
    }
}
