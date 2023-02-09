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

        Definition definition3 = new Definition();
        definition3.setId(idCounter++);
        definition3.setWord("Variable");
        definition3.setDefinition("An element, feature, or factor that is liable to vary or change.");

        definitions.add(definition3);

        Definition definition4 = new Definition();
        definition4.setId(idCounter++);
        definition4.setWord("Integrity");
        definition4.setDefinition("The quality of being honest and having strong moral principles; moral uprightness.");

        definitions.add(definition4);

        Definition definition5 = new Definition();
        definition5.setId(idCounter++);
        definition5.setWord("Culture");
        definition5.setDefinition("The customs, arts, social institutions, and achievements of a particular nation, people, or other social group.");

        definitions.add(definition5);

        Definition definition6 = new Definition();
        definition6.setId(idCounter++);
        definition6.setWord("Regression");
        definition6.setDefinition("A return to a former or less developed state.");
        definitions.add(definition6);

        Definition definition7 = new Definition();
        definition7.setId(idCounter++);
        definition7.setWord("Growth");
        definition7.setDefinition("The process of increasing in amount, value, or importance.");

        definitions.add(definition7);

        Definition definition8 = new Definition();
        definition8.setId(idCounter++);
        definition8.setWord("Seismic");
        definition8.setDefinition("Of enormous proportions or effect.");

        definitions.add(definition8);

        Definition definition9 = new Definition();
        definition9.setId(idCounter++);
        definition9.setWord("Home");
        definition9.setDefinition("A place where something flourishes, is most typically found, or from which it originates.");

        definitions.add(definition9);

        Definition definition10 = new Definition();
        definition10.setId(idCounter++);
        definition10.setWord("International");
        definition10.setDefinition("Existing, occurring, or carried on between two or more nations");

        definitions.add(definition10);
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
