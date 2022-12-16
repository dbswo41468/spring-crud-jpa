package com.dw.springcrudjpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "dw_process")
public class Dept {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    // 번호
    @Column
    private int num; // pk

    // 과정명
    @Column
    private String process_name; //

    // 과정 호실
    @Column
    private int process_class; //

    // 과정 기간
    @Column
    private String process_time; //

    // 담당 교사
    @Column
    private String process_teacher; //

}
