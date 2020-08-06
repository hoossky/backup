package com.project.web.progress;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ProgressControllerTests {

    @Autowired
    ProgressController progressController;


    @Test
    void helloWorld() {
        assertThat(progressController.HelloWorld()).isEqualTo("TDD SUCESS!!");
    }

}
