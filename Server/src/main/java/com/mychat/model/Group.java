package com.mychat.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "COM_GROUP")
@Data
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OBJECT_RRN")
    private Long objectRrn;

    @Column(name = "USER_RRN")
    private Long userRrn;

    @Column(name = "GROUP_RRN")
    private Long groupRrn;

    @Column(name = "GROUP_NAME")
    private String groupName;

    @Column(name = "GROUP_COUNT")
    private Integer groupCount;

}
