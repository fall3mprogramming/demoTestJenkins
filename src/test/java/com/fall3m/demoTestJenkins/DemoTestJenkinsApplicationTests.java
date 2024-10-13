package com.fall3m.demoTestJenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoTestJenkinsApplicationTests {

	@Test
    public void testAddition() {
        int result = 1 + 1;
        assertEquals(2, result, "1 + 1 devrait être égal à 2");
    }


}
