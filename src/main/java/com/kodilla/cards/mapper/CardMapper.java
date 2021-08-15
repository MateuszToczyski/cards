package com.kodilla.cards.mapper;

import com.kodilla.cards.domain.Card;
import com.kodilla.cards.dto.CardDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CardMapper {

    public Card toCard(CardDto cardDto) {
        return new Card(cardDto.getId(), cardDto.getCardNumber(), cardDto.getCustomerId());
    }

    public CardDto toCardDto(Card card) {
        return new CardDto(card.getId(), card.getCardNumber(), card.getCustomerId());
    }

    public List<Card> toCardList(List<CardDto> cardDtos) {
        return cardDtos.stream()
                .map(this::toCard)
                .collect(Collectors.toList());
    }

    public List<CardDto> toCardDtoList(List<Card> cards) {
        return cards.stream()
                .map(this::toCardDto)
                .collect(Collectors.toList());
    }
}
