package com.jenKins.jenkinsTrail.Controller;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class welcomeControllerTest {
    Logger logger = LoggerFactory.getLogger(welcomeControllerTest.class);
    @Test
    void welcomeMethod() {
        assertEquals("davi","david","First Failed");
        logger.info("Testing started Da Pts");
    }
}