package com.backend.backend.payload;

import com.backend.backend.entities.Depenses;
import com.backend.backend.entities.Etudiant;
import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class ResponsesDepenses {
    private String message;
    private Depenses depenses;
}
