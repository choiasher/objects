package me.asher.objects.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

@DisplayName("Audience 클래스")
class AudienceTest {
    final BigDecimal givenTicketFee = BigDecimal.valueOf(100L);
    final Ticket givenTicket = new Ticket(givenTicketFee);

    @Nested
    @DisplayName("buy 메소드는")
    class Describe_buy_method {

        @Nested
        @DisplayName("초대장이 있는 경우")
        class Context_with_invitation {
            final Invitation invitation = new Invitation();
            final Bag givenBag = new Bag(invitation, BigDecimal.valueOf(100000L));

            Audience given_초대장_있는_관람객() {
                return new Audience(givenBag);
            }

            @Test
            @DisplayName("관람객의 가방에 티켓을 추가하고, 0을 리턴한다")
            void it_returns_0() {
                final Audience 관람객 = given_초대장_있는_관람객();
                final BigDecimal paid = 관람객.buy(givenTicket);

                Assertions.assertTrue(givenBag.hasTicket(), "(사이드 이펙트) 관람객의 가방에는 티켓이 들어있다");
                Assertions.assertEquals(BigDecimal.ZERO, paid, "관람객은 티켓 비용으로 0 원을 지불했다");
            }
        }

        @Nested
        @DisplayName("초대장이 없는 경우")
        class Context_with_no_invitation {
            final Bag givenBag() {
                return new Bag(BigDecimal.valueOf(100000L));
            }

            Audience given_초대장_없는_관람객(Bag givenBag) {
                return new Audience(givenBag);
            }

            @Test
            @DisplayName("관람객의 가방에 티켓을 추가하고, 지불한 티켓 값을 리턴한다")
            void it_puts_a_ticket_into_bag() {
                final Bag 가방 = givenBag();
                final BigDecimal paid = given_초대장_없는_관람객(가방).buy(givenTicket);

                Assertions.assertTrue(가방.hasTicket(), "(사이드 이펙트) 관람객의 가방에는 티켓이 들어있다");
                Assertions.assertEquals(paid, givenTicketFee, "관람객이 지불한 돈은 티켓 값만큼이다");
            }
        }
    }
}