package com.backend.backend.repositories;

import com.backend.backend.entities.Etudiant;
import com.backend.backend.entities.Recettes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecetteRepository extends JpaRepository<Recettes, Long> {

}
