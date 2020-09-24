package com.practice.thymeleafcourse.domain;

/**
 * Created by sousaJ on 24/09/2020
 * in package - com.practice.thymeleafcourse.domain
 **/
public class Author {

    private Integer id;
    private String firstName;
    private String lastName;
    private String image;

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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}