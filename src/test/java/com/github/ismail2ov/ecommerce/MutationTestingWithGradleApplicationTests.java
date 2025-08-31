package com.github.ismail2ov.ecommerce;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import org.junit.jupiter.api.Test;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class MutationTestingWithGradleApplicationTests {

    @Test
    void contextLoads() {
    }

}
