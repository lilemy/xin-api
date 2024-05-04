package com.lilemy.xinapiclientsdk.model.enums;

/**
 * 四则运算符
 */
public enum OperationEnum {

    SUM("加法", "sum"),
    SUBTRACT("减法", "subtract"),
    MULTIPLY("乘法", "multiply"),
    DIVIDE("除法", "divide");

    private final String text;

    private final String value;

    OperationEnum(String text, String value) {
        this.text = text;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String getText() {
        return text;
    }

}
