/**
 * Quote controller tests
 */
package com.company.MartinezChaconSummativeProject1;

import com.company.MartinezChaconSummativeProject1.controller.QuoteController;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(QuoteController.class)
public class QuoteControllerTests
{
    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    /**
     * Tests response status of Quote Controller endpoint
     * "/quote" should be "200 OK"
     * @throws Exception
     */
    @Test
    public void shouldReturnHTTPResponseStatus200Ok() throws Exception
    {
        // Arrange : none

        // Act
        mockMvc.perform(get("/quote"))
                .andExpect(status().isOk());
    }

}
