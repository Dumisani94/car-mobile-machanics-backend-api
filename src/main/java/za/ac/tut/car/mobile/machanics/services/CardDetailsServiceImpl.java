package za.ac.tut.car.mobile.machanics.services;

import org.springframework.stereotype.Service;
import za.ac.tut.car.mobile.machanics.enities.CardDetails;
import za.ac.tut.car.mobile.machanics.repositories.CardDetailsRepository;

import java.util.List;

@Service
public class CardDetailsServiceImpl implements CardDetailsService {

    private final CardDetailsRepository cardDetailsRepository;

    public CardDetailsServiceImpl(CardDetailsRepository cardDetailsRepository) {
        this.cardDetailsRepository = cardDetailsRepository;
    }

    @Override
    public CardDetails saveCard(CardDetails cardDetails) {
        return cardDetailsRepository.save(cardDetails);
    }

    @Override
    public CardDetails updateCard(CardDetails cardDetails) {
        return cardDetailsRepository.save(cardDetails);
    }

    @Override
    public List<CardDetails> findByUserId(Long userId) {
        return cardDetailsRepository.retrieveCardById(userId);
    }

    @Override
    public List<CardDetails> retrieveAll() {
        return cardDetailsRepository.findAll();
    }

    @Override
    public Integer delete(int cardId) {
        return null;
    }
}
