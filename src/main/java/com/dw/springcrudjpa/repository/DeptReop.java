package com.dw.springcrudjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dw.springcrudjpa.model.Dept;

// interface 로 변경 후 extends JpaRepository<model의 클래스 이름, Long>
public interface DeptReop extends JpaRepository<Dept, Long> {

}
