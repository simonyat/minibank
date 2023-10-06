package org.sdmtr.mini.bank.model.business;

import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@RequiredArgsConstructor
public class Account {
    private final String accountNumber;
    private final UUID clientId;
    private AccountType accountType;
    private final float percentageRate;
    private BigDecimal balance;
}
