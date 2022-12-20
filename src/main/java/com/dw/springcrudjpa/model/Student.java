package com.dw.springcrudjpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "dw_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long studentNum; // 학생번호(pk)
    @Column(length = 30)
    private String studentName; // 학생이름
    @Column
    private int studentAge; // 학생나이
    @Column
    private String studentPhone; // 학생연락처
    @Column
    private String address; // 주소

    @ManyToOne
    @JoinColumn(name = "processNumber")
    private Dept dept;
}
