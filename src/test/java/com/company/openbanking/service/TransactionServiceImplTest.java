package com.company.openbanking.service;

import com.company.openbanking.entity.Transaction;
import com.company.openbanking.repository.TransactionRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class TransactionServiceImplTest {

    @Mock
    private TransactionRepository transactionRepository;
    @InjectMocks
    private TransactionServiceImpl transactionService;

    private Transaction transaction;

    @BeforeEach
    public void init() {
         transaction = Transaction.builder()
                .type("type")
                .date(LocalDate.now())
                .accountNumber(123)
                .currency("BLR")
                .amount(BigDecimal.valueOf(300))
                .merchantName("John Brown")
                .merchantLogo("logo")
                .build();

    }

    @Test
    public void TransactionService_findAllByAccountNumber_ReturnListOfTransactions() {

        Integer accountNum = 1;
        when(transactionRepository.findTransactionsByAccountNumber(accountNum))
                .thenReturn(Arrays.asList(transaction));

        List<Transaction> list = transactionService.findAllByAccountNumber(accountNum);

        assertThat(list.size()).isEqualTo(1);


    }
}
