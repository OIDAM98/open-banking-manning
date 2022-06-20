package dev.odalva.banking.web;

import dev.odalva.banking.model.Transaction;
import dev.odalva.banking.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(
        path="/api/v1/transactions",
        produces = "application/json"
)
@CrossOrigin(origins = "*")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/{accountNumber}")
    public List<Transaction> findAllByAccountNumber(@PathVariable("accountNumber") final int accountNumber) {
        return transactionService.findAllByAccountNumber(accountNumber);
    }
}
