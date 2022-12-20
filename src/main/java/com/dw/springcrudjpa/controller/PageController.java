package com.dw.springcrudjpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/depts")
    public String loadDeptPage() {
        return "dept";
    }

    @GetMapping("/indexs")
    public String loadIndexPage() {
        return "index";
    }
}
