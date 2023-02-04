/**
 * Word controller tests
 */
package com.company.MartinezChaconSummativeProject1;

import com.company.MartinezChaconSummativeProject1.controller.WordController;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


@RunWith(SpringRunner.class)
@WebMvcTest(WordController.class)
public class  WordControllerTests
{
    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    /**
     * Tests response status of Word Controller endpoint
     * "/word" should be "200 OK"
     * @throws Exception 
     */
    @Test
    public void shouldReturnARandomDefinitionForAWord() throws Exception
    {
        // Arrange : none

        // Act
        mockMvc.perform(get("/word"))
                .andExpect(status().isOk());
    }
}