package com.company.openbanking.service;

import com.company.openbanking.entity.Transaction;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;


@ExtendWith(MockitoExtension.class)
public class TransactionServiceImplTest {

    @InjectMocks
    private TransactionServiceImpl transactionService;

    @Test
    public void TransactionService_findAllByAccountNumber_ReturnListOfTransactions() {

        Integer transactionNum = 1;
        List<Transaction> list = transactionService.findAllByAccountNumber(transactionNum);

        assertThat(list.size()).isEqualTo(3);




    }
}
