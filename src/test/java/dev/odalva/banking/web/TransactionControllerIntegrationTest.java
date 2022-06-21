package dev.odalva.banking.web;

import dev.odalva.banking.model.Transaction;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class TransactionControllerIntegrationTest {

    @MockBean
    private TransactionController controller;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testConnection() throws Exception {
        when(controller.findAllByAccountNumber(0)).thenReturn(List.of(new Transaction(
                "income",
                LocalDate.now(),
                100,
                "MX",
                100.00,
                "odalva",
                "logo"
        )));

        mockMvc.perform(get("/api/v1/transactions/0"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$", hasSize(1)));

        verify(controller, times(1)).findAllByAccountNumber(0);
    }
}