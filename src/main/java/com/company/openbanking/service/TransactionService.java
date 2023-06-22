package com.company.openbanking.service;

import com.company.openbanking.entity.Transaction;

import java.util.List;

public interface TransactionService {

    List<Transaction> findAllByAccountNumber(Integer accountNumber);
}
