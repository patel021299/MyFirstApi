package com.example.mysqldemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/emp")
public class EmpController {
    @Autowired
    private EmpRepository empRepository;

    @PostMapping(path = "/add")
    public @ResponseBody Employee addEmp(@RequestBody Employee employee){
        return empRepository.save(employee);
    }
}
