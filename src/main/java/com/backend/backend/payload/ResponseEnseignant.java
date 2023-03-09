package com.backend.backend.payload;

import com.backend.backend.entities.Enseignant;
import com.backend.backend.entities.Etudiant;
import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class ResponseEnseignant {
    private String message;
    private Enseignant enseignant;
}
