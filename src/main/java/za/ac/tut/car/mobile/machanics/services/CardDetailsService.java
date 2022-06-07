package za.ac.tut.car.mobile.machanics.services;

import org.springframework.stereotype.Service;
import za.ac.tut.car.mobile.machanics.enities.CardDetails;

import java.util.List;

@Service
public interface CardDetailsService {

    CardDetails saveCard(CardDetails cardDetails);

    CardDetails updateCard(CardDetails cardDetails);

    List<CardDetails> findByUserId(Long userId);

    List<CardDetails> retrieveAll();

    Integer delete(int cardId);

}
