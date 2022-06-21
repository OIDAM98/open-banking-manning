package dev.odalva.banking.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class TransactionComponentTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void testConnection() throws Exception {
        mockMvc
                .perform(MockMvcRequestBuilders.get("/api/v1/transactions/0"))
                .andExpect(status().isOk());
    }
}
