package com.vsvdev.jenkins;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerTest {

  @Autowired
  private TestRestTemplate restTemplate;

  @Test
  void findAll_shouldReturnString() {
    final String answer = restTemplate.getForObject("/hello", String.class);
    assertTrue(answer.length() > 0);
    assertEquals("Hello from VSVDev", answer);
  }
}
