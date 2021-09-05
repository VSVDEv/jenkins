package com.vsvdev.jenkins;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
class JenkinsApplicationTests {
  @Autowired
  WebApplicationContext context;

  @Test
  void contextLoads() {
    assertFalse(context.equals(null));
  }

}
