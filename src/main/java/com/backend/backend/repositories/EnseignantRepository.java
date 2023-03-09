package com.backend.backend.repositories;

import com.backend.backend.entities.Enseignant;
import com.backend.backend.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnseignantRepository extends JpaRepository<Enseignant, Long> {
}
