package com.example.additioncalculator.controller;


import com.example.additioncalculator.response.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {

    @GetMapping("/{firstPart}")
    public Result addByTen(@PathVariable("firstPart") String firstPart){
        return new Result(String.valueOf(Integer.valueOf(firstPart) + 10));
    }

    @GetMapping("/{firstPart}/{secondPart}")
    public Result add(@PathVariable("firstPart") String firstPart,
                           @PathVariable("secondPart") String secondPart){
        return new Result(String.valueOf(Integer.valueOf(firstPart) + Integer.valueOf(secondPart)));
    }
}
