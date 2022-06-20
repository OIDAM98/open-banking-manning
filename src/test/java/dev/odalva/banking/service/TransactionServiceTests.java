package dev.odalva.banking.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TransactionServiceTests {

    @Autowired
    private TransactionService service;

    @Test
    void getTransactions() {
        assertEquals(3, service.findAllByAccountNumber(0).size());
    }
}
