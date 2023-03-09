package com.backend.backend.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Budget implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private double montant;

    private String date_paiment;

    @OneToOne
    private Recettes recettes;

    @OneToOne
    private Depenses depenses;

}
