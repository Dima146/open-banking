package com.company.openbanking.service;

import com.company.openbanking.model.Transaction;

import java.util.List;

public interface TransactionService {

    List<Transaction> findAllByAccountNumber(Integer accountNumber);
}
