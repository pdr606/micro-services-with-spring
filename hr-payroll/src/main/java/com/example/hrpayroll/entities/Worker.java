package com.example.hrpayroll.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class Worker {
    private Long id;
    private String name;
    private Double dailyIncome;
}
