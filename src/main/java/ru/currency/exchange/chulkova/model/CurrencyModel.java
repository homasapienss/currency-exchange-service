package ru.currency.exchange.chulkova.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyModel {
    private Integer id;
    private String code;
    private String fullName;
    private String sign;
}
