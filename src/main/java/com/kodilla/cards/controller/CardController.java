package com.kodilla.cards.controller;

import com.kodilla.cards.controller.response.GetCardsResponse;
import com.kodilla.cards.dto.CardDto;
import com.kodilla.cards.service.CardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RefreshScope
@RestController
@RequestMapping("/v1/cards")
@RequiredArgsConstructor
public class CardController {

    private final CardService cardService;

    @GetMapping
    public GetCardsResponse findByCustomerId(@RequestParam Long customerId) {
        log.debug("Get cards for customerId {}", customerId);
        List<CardDto> cards = cardService.findByCustomerId(customerId);
        return GetCardsResponse.of(cards);
    }
}
