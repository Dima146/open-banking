package com.company.openbanking.service;

import com.company.openbanking.entity.Transaction;
import com.company.openbanking.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;

    @Autowired
    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public List<Transaction> findAllByAccountNumber(Integer accountNumber) {

        return transactionRepository.findTransactionsByAccountNumber(accountNumber);
    }
}
