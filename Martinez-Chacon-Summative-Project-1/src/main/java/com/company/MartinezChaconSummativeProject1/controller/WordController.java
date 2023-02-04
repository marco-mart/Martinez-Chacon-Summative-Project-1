package com.company.MartinezChaconSummativeProject1.controller;

import com.company.MartinezChaconSummativeProject1.models.Definition;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WordController
{

    /**
     * NOTE: Word API returns a DEFINITION Model
     */
    private List<Definition> definitions;

    private static int idCounter = 1;

    public WordController()
    {
         definitions = new ArrayList<Definition>();

        Definition definition1 = new Definition();
        definition1.setId(idCounter++);
        definition1.setWord("Serendipity");
        definition1.setDefinition("The occurrence and development of events by chance in a happy or beneficial way.");

        definitions.add(definition1);

        Definition definition2 = new Definition();
        definition2.setId(idCounter++);
        definition2.setWord("Stipulation");
        definition2.setDefinition("A condition or requirement that is specified or demanded as part of an agreement.");

        definitions.add(definition2);
    }

    /**
     * Endpoint "/word" which will return a random definition for a word
     * @return a random definition
     */
    @GetMapping(value = "/word")
    @ResponseStatus(value = HttpStatus.OK)
    public Definition getRandomDefinitionOfWord()
    {
        // generate random index for in-memory data
        int range = definitions.size();
        int randomIndex = (int) (Math.random() * range);

        return definitions.get(randomIndex);
    }


}
