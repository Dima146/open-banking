package com.company.openbanking.controller;

import com.company.openbanking.model.Transaction;
import com.company.openbanking.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TransactionController {

    private final TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @RequestMapping("/transactions/{accountNumber}")
    public List<Transaction> findAllByAccountNumber(@PathVariable("accountNumber") Integer accountNumber) {

        return transactionService.findAllByAccountNumber(accountNumber);

    }

}
