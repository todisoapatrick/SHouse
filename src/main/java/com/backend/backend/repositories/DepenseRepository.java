package com.backend.backend.repositories;

import com.backend.backend.entities.Depenses;
import com.backend.backend.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepenseRepository extends JpaRepository<Depenses, Long> {
}
