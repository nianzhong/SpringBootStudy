package com.spring.springbootstudy;

import com.spring.springbootstudy.study.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Experiment2Tests {

    @Autowired
    private Student student;


    @Test
    public void test1() {
        System.out.println(student);
    }
}
