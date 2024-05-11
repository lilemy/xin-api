package com.lilemy.xinapiinterface.controller;

import com.lilemy.xinapiclientsdk.model.OperationNumber;
import com.lilemy.xinapicommon.common.ErrorCode;
import com.lilemy.xinapicommon.exception.BusinessException;
import org.springframework.web.bind.annotation.*;

/**
 * 模拟接口：实现简单的加减乘除
 */
@RestController
@RequestMapping("/operation")
public class OperationController {

    private static final String PARAMS_ERROR = "参数错误";

    @PostMapping("/sum")
    public Double getSum(@RequestBody OperationNumber number) {
        Double firstNumber = number.getFirstNumber();
        Double secondNumber = number.getSecondNumber();
        if (firstNumber == null || secondNumber == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        return firstNumber + secondNumber;
    }

    @PostMapping("/subtract")
    public Double getSubtract(@RequestBody OperationNumber number) {
        Double firstNumber = number.getFirstNumber();
        Double secondNumber = number.getSecondNumber();
        if (firstNumber == null || secondNumber == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        return firstNumber - secondNumber;
    }

    @PostMapping("/multiply")
    public Double getMultiply(@RequestBody OperationNumber number) {
        Double firstNumber = number.getFirstNumber();
        Double secondNumber = number.getSecondNumber();
        if (firstNumber == null || secondNumber == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        return firstNumber * secondNumber;
    }

    @PostMapping("/divide")
    public Double getDivide(@RequestBody OperationNumber number) {
        Double firstNumber = number.getFirstNumber();
        Double secondNumber = number.getSecondNumber();
        if (firstNumber == null || secondNumber == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        return firstNumber / secondNumber;
    }
}
