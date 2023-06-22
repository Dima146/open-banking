package com.company.openbanking.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Transaction {

    private String type;
    private LocalDate date;
    private Integer accountNumber;
    private String currency;
    private BigDecimal amount;
    private String merchantName;
    private String merchantLogo;


}
