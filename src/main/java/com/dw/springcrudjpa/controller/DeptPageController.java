package com.dw.springcrudjpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeptPageController {

    @GetMapping("/dept")
    public String loadDeptPage() {
        return "dept";
    }
}
