package com.mychat.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "COM_FRIEND")
@Data
public class Friend {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OBJECT_RRN", columnDefinition = "int(15)" , unique = true)
    private Long objectRrn;

    @Column(name = "USER_RRN", columnDefinition = "int(15)")
    private Long userRrn;

    @Column(name = "FRIEND_RRN", columnDefinition = "int(15)")
    private Long friendRrn;

    @Column(name = "NICK_NAME", columnDefinition = "varchar(16)")
    private String nickName;

}
