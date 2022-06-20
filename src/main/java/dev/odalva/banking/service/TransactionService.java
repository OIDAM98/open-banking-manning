package dev.odalva.banking.service;

import dev.odalva.banking.model.Transaction;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService {

    private List<Transaction> transactions = List.of(
            new Transaction(
                    "smt",
                    LocalDate.now(),
                    101,
                    "MX",
                    103.00,
                    "Oscar",
                    "smt"
                    ),
            new Transaction(
                    "smt",
                    LocalDate.now(),
                    102,
                    "MX",
                    103.00,
                    "Oscar",
                    "smt"
            ),
            new Transaction(
                    "smt",
                    LocalDate.now(),
                    103,
                    "MX",
                    103.00,
                    "Oscar",
                    "smt"
            )
    );

    public List<Transaction> findAllByAccountNumber(final int accNum) {
        return transactions;
    }
}
