package com.company.MartinezChaconSummativeProject1.controller;

import com.company.MartinezChaconSummativeProject1.models.Magic8Ball;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Magic8BallController
{

    private List<Magic8Ball> magic8Balls;

    private static int idCounter = 1;

    // NOTE: Magic8Ball is not to be initialized with a question,
    //       as the request body of the GET request will provide one.
    public Magic8BallController()
    {
        magic8Balls = new ArrayList<Magic8Ball>();

        Magic8Ball ball1 = new Magic8Ball();
        ball1.setId(idCounter++);
        ball1.setAnswer("Maybe");

        Magic8Ball ball2 = new Magic8Ball();
        ball2.setId(idCounter++);
        ball2.setAnswer("Yes");

        Magic8Ball ball3 = new Magic8Ball();
        ball3.setId(idCounter++);
        ball3.setAnswer("No");
    }
}
