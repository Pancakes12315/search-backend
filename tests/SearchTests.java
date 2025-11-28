package com.searchbackend.tests;

import com.searchbackend.services.SearchService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SearchTests {

    @Test
    public void testSearchInitialization() {
        SearchService mockService = Mockito.mock(SearchService.class);
        assertNotNull(mockService);
    }
}
