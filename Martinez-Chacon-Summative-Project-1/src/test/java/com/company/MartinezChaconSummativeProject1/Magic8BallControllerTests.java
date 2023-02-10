/**
 * Magic8Ball controller tests
 */
package com.company.MartinezChaconSummativeProject1;

import com.company.MartinezChaconSummativeProject1.controller.Magic8BallController;
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
     * "/magic" should be "201 CREATED"
     * @throws Exception
     */
    @Test
    public void shouldReturnNewResponseOnPostRequest() throws Exception {

        // ARRANGE: none

        // ACT

        // test with a question
        mockMvc.perform(
                        post("/magic")                           // Perform the POST request
                                .content("question")                        // Set the request body
                                .contentType(MediaType.APPLICATION_JSON)    // tell the server its in JSON format
                )
                .andDo(print())                                // Print results to console
                .andExpect(status().isCreated());              // ASSERT (status code is 201)

        // test without a question
        mockMvc.perform(
                        post("/magic")        // Perform the POST request
                )
                .andDo(print())                                // Print results to console
                .andExpect(status().isCreated());              // ASSERT (status code is 201)
    }

}