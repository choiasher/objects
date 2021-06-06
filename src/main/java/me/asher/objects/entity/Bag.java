package me.asher.objects.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class Bag {
    private BigDecimal amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(BigDecimal amount) {
        this.amount = amount;
    }

    public Bag(Invitation invitation, BigDecimal amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    public boolean hasInvitation() {
        return invitation != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    public void minusAmount(BigDecimal amount) {
        this.amount = this.amount.subtract(amount);
    }

    public void plusAmount(BigDecimal amount) {
        this.amount = this.amount.add(amount);
    }
}
