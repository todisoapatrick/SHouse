package com.backend.backend.payload;

import com.backend.backend.entities.Budget;
import com.backend.backend.entities.Etudiant;
import com.backend.backend.entities.Recettes;
import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class RecetteRequestEtudiant {

    private Recettes recettes;
    private Etudiant etudiant;
//    private Budget budget;

}
