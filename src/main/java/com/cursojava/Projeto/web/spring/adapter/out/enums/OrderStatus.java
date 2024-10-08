package com.cursojava.Projeto.web.spring.adapter.out.enums;

import lombok.Getter;

@Getter
public enum OrderStatus {
    WATCHING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private final int code;

    OrderStatus(int code) {
        this.code = code;
    }

    public static OrderStatus valueOf(int code) {
        //percorre todos os valores do OrderStatus
        for (OrderStatus value : OrderStatus.values()) {
            if (value.getCode() == code)
                return value;
        }
        throw new IllegalArgumentException("Invalid OrderStatus code");
    }
}


