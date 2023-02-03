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
    public Magic8BallController()
    {
        magic8Balls = new ArrayList<Magic8Ball>();

        Magic8Ball ball1 = new Magic8Ball();
        ball1.setId(idCounter++);
        ball1.setQuestion("");
        ball1.setAnswer("Maybe");
    }
}
