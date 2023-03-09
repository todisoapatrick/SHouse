package com.backend.backend.payload;

import com.backend.backend.entities.Etudiant;
import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class ResponseEtudiant {

    private String message;
    private Etudiant etudiant;

}
