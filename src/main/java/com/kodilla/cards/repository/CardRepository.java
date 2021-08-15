package com.kodilla.cards.repository;

import com.kodilla.cards.domain.Card;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CardRepository extends CrudRepository<Card, Long> {

    List<Card> findByCustomerId(Long customerId);

}
