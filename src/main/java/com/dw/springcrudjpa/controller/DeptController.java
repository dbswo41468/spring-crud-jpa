package com.dw.springcrudjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dw.springcrudjpa.model.Dept;
import com.dw.springcrudjpa.repository.DeptReop;

@Controller

// @RestController = 데이터 전달용
@RestController
public class DeptController {
    @Autowired
    DeptReop repo;

    // 조회
    // sql 만들기
    // 서비스
    // 전체를 찾는다
    @GetMapping("/processdept")
    public List<Dept> callAllDepts() {
        // findAll == select * from <테이블 이름>
        return repo.findAll();
    }

    // 추가
    @PostMapping("/processdept")
    public Dept callSaveDept(@RequestBody Dept dept) {
        // save == update & insert
        // 동일한 pk 값이 있으면 update
        // 동일한 pk 값이 없으면 insert
        dept = repo.save(dept);
        return dept;
    }

    // 상세조회
    @GetMapping("/processdept/{process_number}")
    public Dept callDeptById(@PathVariable Long process_number) {
        // findById == select # from emp where empno = 333;
        return repo.findById(process_number).get();
    }

    // 삭제
    @DeleteMapping("/processdept/{infoNum}")
    public boolean callDeleteMemeber(@PathVariable long infoNum) {

        // deleteById == delete
        // by == where
        try {
            repo.deleteById(infoNum); // 리턴 타입이 void
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // 수정
    @PatchMapping("/processdept")
    public Dept updateDate(@RequestBody Dept dept) {
        // save == update & insert
        // 동일한 pk 값이 있으면 update
        // 동일한 pk 값이 없으면 insert
        dept = repo.save(dept);
        return dept;
    }
}