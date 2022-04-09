package com.mychat.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "COM_USER")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OBJECT_RRN")
    private Long objectRrn;

    @Column(name = "NAME")
    private String name;

    @Column(name = "AGE")
    private Integer age;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "SEX")
    private String sex;

    @Column(name = "STATUS")
    private String status;


}
