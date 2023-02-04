package com.company.MartinezChaconSummativeProject1.controller;

import com.company.MartinezChaconSummativeProject1.models.Quote;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuoteController {
    private List<Quote> quotes;

    private static int idCounter = 1;

    public QuoteController()
    {
        quotes = new ArrayList<Quote>();

        Quote quote1 = new Quote();
        quote1.setId(idCounter++);
        quote1.setQuote("Everything that irritates us about others can lead us to an understanding of ourselves.");
        quote1.setAuthor("Carl Jung");

        Quote quote2 = new Quote();
        quote2.setId(idCounter++);
        quote2.setQuote("I'm funny how, I mean funny like I'm a clown?");
        quote2.setAuthor("Joe Pesci");
    }
}
