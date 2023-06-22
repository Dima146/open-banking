package com.company.openbanking.service;

import com.company.openbanking.model.Transaction;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Override
    public List<Transaction> findAllByAccountNumber(Integer accountNumber) {

        Transaction tr1 = new Transaction();
        Transaction tr2 = new Transaction();
        Transaction tr3 = new Transaction();
        List<Transaction> transactionList = List.of(tr1, tr2, tr3);

        return accountNumber == null ? Collections.emptyList() : transactionList;
    }
}
