package com.spring.springbootstudy.study;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Map;

/**
 * @author qing
 */
@Component
@PropertySource("classpath:application.properties")
@ConfigurationProperties("student")
public class Student {
    private Integer id;
    private String firstName;
    private String lastName;
    private String studentName;
    private Sex sex;
    private String[] hobby;
    private Map<String, String> family;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public Map<String, String> getFamily() {
        return family;
    }

    public void setFamily(Map<String, String> family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentName='" + studentName + '\'' +
                ", sex=" + sex +
                ", hobby=" + Arrays.toString(hobby) +
                ", family=" + family +
                '}';
    }
}
