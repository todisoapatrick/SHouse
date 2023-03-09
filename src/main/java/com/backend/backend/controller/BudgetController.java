package com.backend.backend.controller;

import com.backend.backend.entities.Budget;
import com.backend.backend.entities.Depenses;
import com.backend.backend.repositories.BudgetRepository;
import com.backend.backend.repositories.DepenseRepository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class BudgetController {
    private final BudgetRepository budgetRepository;

    public BudgetController(BudgetRepository budgetRepository) {
        this.budgetRepository = budgetRepository;
    }

    @GetMapping(path = "/getAll")
    public List<Budget> getAll() {
        return budgetRepository.findAll();
    }
}
