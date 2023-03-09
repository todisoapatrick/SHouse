package com.backend.backend.entities;

import com.backend.backend.payload.Types;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Depenses implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String description;

    private Date datedepense;

    private double montant;

    @Enumerated(EnumType.STRING)
    private Types types;

    @OneToOne
    private Budget budget;

    @OneToOne
    private Enseignant enseignant;

}
