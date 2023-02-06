package com.company.MartinezChaconSummativeProject1.controller;

import com.company.MartinezChaconSummativeProject1.models.Answer;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Magic8BallController
{
    /**
     * NOTE: Magic8Ball API will return an ANSWER model
     *
     *       Answer model is not to be initialized with a question,
     *       as the request body of the GET request will provide one.
     */
    private List<Answer> answers;
    private static int idCounter = 1;

    public Magic8BallController()
    {
        answers = new ArrayList<Answer>();

        Answer answer1 = new Answer();
        answer1.setId(idCounter++);
        answer1.setAnswer("Maybe");

        Answer answer2 = new Answer();
        answer2.setId(idCounter++);
        answer2.setAnswer("Yes");

        Answer answer3 = new Answer();
        answer3.setId(idCounter++);
        answer3.setAnswer("No");

        /* this is a test by Ashley Chacon */
    }
}
