package com.company.MartinezChaconSummativeProject1.controller;
import com.company.MartinezChaconSummativeProject1.models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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

        quotes.add(quote1);

        Quote quote2 = new Quote();
        quote2.setId(idCounter++);
        quote2.setQuote("I'm funny how, I mean funny like I'm a clown?");
        quote2.setAuthor("Joe Pesci");

        quotes.add(quote2);

        Quote quote3 = new Quote();
        quote3.setId(idCounter++);
        quote3.setQuote("You cannot escape the responsibility of tomorrow by evading it today.");
        quote3.setAuthor("Abraham Lincoln");

        quotes.add(quote3);

        Quote quote4 = new Quote();
        quote4.setId(idCounter++);
        quote4.setQuote("Give me six hours to chop down a tree and I will spend the first four sharpening the axe.");
        quote4.setAuthor("Abraham Lincoln");

        quotes.add(quote4);

        Quote quote5 = new Quote();
        quote5.setId(idCounter++);
        quote5.setQuote("The worst thing about prison was the dementors.");
        quote5.setAuthor("Michael Scott");

        quotes.add(quote5);

        Quote quote6 = new Quote();
        quote6.setId(idCounter++);
        quote6.setQuote("I declare bankruptcy!");
        quote6.setAuthor("Michael Scott");

        quotes.add(quote6);

        Quote quote7 = new Quote();
        quote7.setId(idCounter++);
        quote7.setQuote("You Should've Seen The Look On Her Face! It Was The Same Look My Father Gave Me When I Told Him I Wanted To Be A Ventriloquist!");
        quote7.setAuthor("George Costanza");

        quotes.add(quote7);

        Quote quote8 = new Quote();
        quote8.setId(idCounter++);
        quote8.setQuote("The past has no power over the present moment.");
        quote8.setAuthor("Eckhart Tolle");

        quotes.add(quote8);

        Quote quote9 = new Quote();
        quote9.setId(idCounter++);
        quote9.setQuote("Success is not final, failure is not fatal: It is the courage to continue that counts.");
        quote9.setAuthor("Winston Churchill");

        quotes.add(quote9);

        Quote quote10 = new Quote();
        quote10.setId(idCounter++);
        quote10.setQuote("If you want something done, ask a busy person to do it.");
        quote10.setAuthor("Laura Ingalls Wilder");

        quotes.add(quote10);
    }


    /**
     * Endpoint "/quote" which will return a random quote
     * @return a random quote
     */
    @GetMapping(value = "/quote")
    @ResponseStatus(value = HttpStatus.OK)
    public Quote getRandomQuote()
    {
        // generate random index for in-memory data
        int range = quotes.size();
        int randomIndex = (int) (Math.random() * range);

        return quotes.get(randomIndex);
    }
}
