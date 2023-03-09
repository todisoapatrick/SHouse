package com.backend.backend.payload;

import com.backend.backend.entities.Budget;
import com.backend.backend.entities.Etudiant;
import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class ResponseBudget {
    private String message;
    private Budget budget;
}
