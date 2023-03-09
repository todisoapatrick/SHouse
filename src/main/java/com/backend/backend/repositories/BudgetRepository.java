package com.backend.backend.repositories;

import com.backend.backend.entities.Budget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BudgetRepository extends JpaRepository<Budget, Long> {

    @Query(value = "SELECT SUM(montant) FROM Budget b")
    double getTotalBudget();

}
