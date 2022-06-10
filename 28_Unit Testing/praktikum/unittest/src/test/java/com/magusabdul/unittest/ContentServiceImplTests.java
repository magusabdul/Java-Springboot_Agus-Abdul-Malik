package com.magusabdul.unittest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContentServiceImplTests {

    private ContentService contentService;

    @Test
    void testGenerateFormalName() {
        contentService = new ContentServiceImpl();
        String result = contentService.generateFormalName("Eka", true);

        assertEquals("PakEka", result);

    }
}
