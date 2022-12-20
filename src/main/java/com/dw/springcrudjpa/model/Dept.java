package com.dw.springcrudjpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    private Long processNumber; // pk
    // 과정명
    @Column
    private String processName; //

    // 과정 호실
    @Column
    private int processClass; //

    // 과정 시작 기간
    @Column
    private String processStartPeriod; //

    // 과정 종료 기간
    @Column
    private String processEndPeriod; //

    // 담당 교사
    @Column
    private String processTeacher; //

    // // 조인
    // // One to Many 구분 해야한다
    // // One to One
    // // Many to Many
    // @ManyToOne
    // // @JoinColumn() -> member 테이블에 dept_id 라는 컬럼(FK)생성
    // @JoinColumn(name = "dw_student")
    // private Student student;
}
