package com.kodilla.cards.service;

import com.kodilla.cards.domain.Card;
import com.kodilla.cards.dto.CardDto;
import com.kodilla.cards.mapper.CardMapper;
import com.kodilla.cards.repository.CardRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CardService {
    private final CardRepository cardRepository;
    private final CardMapper cardMapper;

    public List<CardDto> findByCustomerId(Long customerId) {
        List<Card> cards = cardRepository.findByCustomerId(customerId);
        return cardMapper.toCardDtoList(cards);
    }
}
