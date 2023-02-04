package com.company.MartinezChaconSummativeProject1.controller;

import com.company.MartinezChaconSummativeProject1.models.Quote;
import com.company.MartinezChaconSummativeProject1.models.Word;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WordController
{
    private List<Quote> words;

    private static int idCounter = 1;

    public WordController()
    {
        words = new ArrayList<Quote>();

        Word word1 = new Word();
        word1.setId(idCounter++);
        word1.setWord("Serendipity");
        word1.setDefinition("The occurrence and development of events by chance in a happy or beneficial way.");

        Word word2 = new Word();
        word2.setId(idCounter++);
        word2.setWord("Stipulation");
        word2.setDefinition("A condition or requirement that is specified or demanded as part of an agreement.");

    }
}
