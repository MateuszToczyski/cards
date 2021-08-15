package com.kodilla.cards.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardDto {
    private Long id;
    private String cardNumber;
    private Long customerId;
}
