package com.company.MartinezChaconSummativeProject1.controller;

import com.company.MartinezChaconSummativeProject1.models.Quote;
import com.company.MartinezChaconSummativeProject1.models.Definition;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WordController
{

    /**
     * NOTE: Word API returns a DEFINITION Model
     */
    private List<Quote> definitions;

    private static int idCounter = 1;

    public WordController()
    {
         definitions = new ArrayList<Quote>();

        Definition definition1 = new Definition();
        definition1.setId(idCounter++);
        definition1.setWord("Serendipity");
        definition1.setDefinition("The occurrence and development of events by chance in a happy or beneficial way.");

        Definition definition2 = new Definition();
        definition2.setId(idCounter++);
        definition2.setWord("Stipulation");
        definition2.setDefinition("A condition or requirement that is specified or demanded as part of an agreement.");

    }
}
