package dev.odalva.banking.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Transaction {
    public final String type;
    public final LocalDate date;
    public final int accountNumber;
    public final String currency;
    public final double amount;
    public final String merchantName;
    public final String merchantLogo;
}
