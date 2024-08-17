package com.sreyes.tasks.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Task {
    private Long id;
    private String title;
    private String description;
    private LocalDate creationDate;
    private boolean completed;
}
