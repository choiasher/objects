package me.asher.objects.entity;

import java.math.BigDecimal;

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

    private boolean hasInvitation() {
        return invitation != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    private void minusAmount(BigDecimal amount) {
        this.amount = this.amount.subtract(amount);
    }

    public void plusAmount(BigDecimal amount) {
        this.amount = this.amount.add(amount);
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public BigDecimal hold(Ticket ticket) {
        if (hasInvitation()) {
            setTicket(ticket);
            return BigDecimal.ZERO;
        } else {
            setTicket(ticket);
            BigDecimal fee = ticket.getFee();
            minusAmount(fee);
            return fee;
        }
    }

}
