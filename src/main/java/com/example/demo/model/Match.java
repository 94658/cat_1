package com.example.demo.model;

public class Match {
    private Long id;
    private String name;
    private String gender;
    private Long studentid;
    private String description;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentid() {
        return studentid;
    }

    public void setStudentid(Long studentid) {
        this.studentid = studentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Match(long id, String name, String gender, String description) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.description = description;
    }
}
