package com.example.demo.dto.statistic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class MonthlyStatsChatDTO {
    private String month;
    private Integer conversationCount;
    private Integer chatMessageCount;
}
