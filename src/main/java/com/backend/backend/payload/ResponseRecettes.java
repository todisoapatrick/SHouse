package com.backend.backend.payload;

import com.backend.backend.entities.Etudiant;
import com.backend.backend.entities.Recettes;
import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class ResponseRecettes {
    private String message;
    private Recettes recettes;
}
