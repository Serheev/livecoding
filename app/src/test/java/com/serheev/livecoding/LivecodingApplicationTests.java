package com.serheev.livecoding;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("it")
@SpringBootTest(classes=LivecodingApplication.class)
class LivecodingApplicationTests {

    @Test
    void contextLoads() {
    }

}
