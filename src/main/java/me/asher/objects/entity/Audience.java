package me.asher.objects.entity;

import java.math.BigDecimal;

public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public BigDecimal buy(Ticket ticket) {
        return bag.hold(ticket);
    }
}
