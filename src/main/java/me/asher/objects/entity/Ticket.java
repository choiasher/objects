package me.asher.objects.entity;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class Ticket {
    private BigDecimal fee;

    public Ticket(BigDecimal fee) {
        this.fee = fee;
    }
}
