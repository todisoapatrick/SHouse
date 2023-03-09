package com.backend.backend.entities;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;



@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Etudiant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nom, prenom, niveau, adresse, CIN;

//    @OneToOne
//    private Recettes recettes;

}
