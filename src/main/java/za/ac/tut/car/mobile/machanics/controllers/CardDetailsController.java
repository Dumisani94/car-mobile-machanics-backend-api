package za.ac.tut.car.mobile.machanics.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import za.ac.tut.car.mobile.machanics.enities.CardDetails;
import za.ac.tut.car.mobile.machanics.services.CardDetailsService;

import java.util.List;

@RestController
@RequestMapping("/cards")
@CrossOrigin("*")
public class CardDetailsController {

    private final CardDetailsService cardDetailsService;
    private static final Logger log = LoggerFactory.getLogger(CardDetailsService.class);

    public CardDetailsController(CardDetailsService cardDetailsService) {
        this.cardDetailsService = cardDetailsService;
    }

    @GetMapping("/find/user_id/{user_id}")
    public List<CardDetails> findCardDetailsUsingUserId(@PathVariable("user_id") String userId){
        return cardDetailsService.findByUserId(Long.parseLong(userId));
    }

    @GetMapping("/all}")
    public List<CardDetails> retrieveAllCards(){
        return cardDetailsService.retrieveAll();
    }

    @PostMapping("/save")
    public CardDetails saveCard(@RequestBody CardDetails  cardDetails){
        log.info("Adding new card details");
        log.info(cardDetails.toString());
        return cardDetailsService.saveCard(cardDetails);
    }

    @PostMapping("/update")
    public CardDetails updateCard(@RequestBody CardDetails  cardDetails){
        return cardDetailsService.updateCard(cardDetails);
    }
}
