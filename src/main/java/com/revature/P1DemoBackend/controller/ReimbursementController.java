package com.revature.P1DemoBackend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reimbursement")
@RequiredArgsConstructor
public class ReimbursementController {
@GetMapping
    public String welcome(){
        return "welcome into reimbursement portal";
    }
}
