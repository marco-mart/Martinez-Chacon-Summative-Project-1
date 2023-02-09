package com.company.MartinezChaconSummativeProject1.controller;

import com.company.MartinezChaconSummativeProject1.models.Answer;
import com.company.MartinezChaconSummativeProject1.models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
        answers.add(answer1);

        Answer answer2 = new Answer();
        answer2.setId(idCounter++);
        answer2.setAnswer("Yes");
        answers.add(answer2);

        Answer answer3 = new Answer();
        answer3.setId(idCounter++);
        answer3.setAnswer("No");
        answers.add(answer3);

        Answer answer4 = new Answer();
        answer4.setId(idCounter++);
        answer4.setAnswer("Check back later");
        answers.add(answer4);

        Answer answer5 = new Answer();
        answer5.setId(idCounter++);
        answer5.setAnswer("Without a doubt");
        answers.add(answer5);

        Answer answer6 = new Answer();
        answer6.setId(idCounter++);
        answer6.setAnswer("Vague answer");
        answers.add(answer6);

    }

    /**
     * Endpoint "/magic" which will return a random response to a question
     * asked by the user.
     * @param question
     * @return a random answer to a question asked by the user
     */
    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Answer createResponse(@RequestBody(required = false) String question)
    {

        // generate random index for in-memory data
        int range = answers.size();
        int randomIndex = (int) (Math.random() * range);

        // when "/magic" (no question) is invoked (ie empty response body)
        if (question == null)
        {
            Answer temp = new Answer();
            temp.setAnswer(answers.get(randomIndex).getAnswer());
            temp.setQuestion("");

            return temp;
        }

        // we have a question
        Answer answerTemp = answers.get(randomIndex);

        Answer tempObj = new Answer();
        tempObj.setQuestion(question);
        tempObj.setAnswer(answerTemp.getAnswer());

        return tempObj;
    }


}
