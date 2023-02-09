/**
 * Magic8Ball controller tests
 */
package com.company.MartinezChaconSummativeProject1;

import com.company.MartinezChaconSummativeProject1.controller.Magic8BallController;
import com.company.MartinezChaconSummativeProject1.models.Answer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(Magic8BallController.class)
public class Magic8BallControllerTests
{
    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();


    /**
     * Tests response status of Magic8Ball Controller endpoint
     * "/magic-8-ball/{question}" should be "201 CREATED"
     * @throws Exception
     */
    @Test
    public void shouldReturnNewResponseOnPostRequest() throws Exception {

        // ARRANGE
        Answer inputRecord = new Answer();

        // Convert Java Object to JSON
        String inputJson = mapper.writeValueAsString(inputRecord);

        // ACT
        mockMvc.perform(
                        post("/magic-8-ball/test-question")        // Perform the POST request
                )
                .andDo(print())                                // Print results to console
                .andExpect(status().isCreated());              // ASSERT (status code is 201)
    }

}