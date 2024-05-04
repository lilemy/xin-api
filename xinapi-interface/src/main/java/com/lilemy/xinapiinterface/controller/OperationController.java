package com.lilemy.xinapiinterface.controller;

import com.lilemy.xinapiclientsdk.model.OperationNumber;
import org.springframework.web.bind.annotation.*;

/**
 * 模拟接口：实现简单的加减乘除
 */
@RestController
@RequestMapping("/operation")
public class OperationController {

    @PostMapping("/sum")
    public Double getSum(@RequestBody OperationNumber number) {
        Double firstNumber = number.getFirstNumber();
        Double secondNumber = number.getSecondNumber();
        return firstNumber + secondNumber;
    }

    @PostMapping("/subtract")
    public Double getSubtract(@RequestBody OperationNumber number) {
        Double firstNumber = number.getFirstNumber();
        Double secondNumber = number.getSecondNumber();
        return firstNumber - secondNumber;
    }

    @PostMapping("/multiply")
    public Double getMultiply(@RequestBody OperationNumber number) {
        Double firstNumber = number.getFirstNumber();
        Double secondNumber = number.getSecondNumber();
        return firstNumber * secondNumber;
    }

    @PostMapping("/divide")
    public Double getDivide(@RequestBody OperationNumber number) {
        Double firstNumber = number.getFirstNumber();
        Double secondNumber = number.getSecondNumber();
        return firstNumber / secondNumber;
    }
}
