package com.backend.backend.controller;


import com.backend.backend.entities.Budget;
import com.backend.backend.entities.Etudiant;
import com.backend.backend.entities.Recettes;
import com.backend.backend.payload.RecetteRequestEtudiant;
import com.backend.backend.repositories.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

import static com.backend.backend.BackendApplication.LOGGER;

@RestController
public class ApplicationController {

    private final BudgetRepository budgetRepository;
    private final EnseignantRepository enseignantRepository;
    private final DepenseRepository depenseRepository;
    private final RecetteRepository recetteRepository;
    private final EtudiantRepository etudiantRepository;


    public ApplicationController(BudgetRepository budgetRepository, EnseignantRepository enseignantRepository, DepenseRepository depenseRepository, RecetteRepository recetteRepository, EtudiantRepository etudiantRepository) {
        this.budgetRepository = budgetRepository;
        this.enseignantRepository = enseignantRepository;
        this.depenseRepository = depenseRepository;
        this.recetteRepository = recetteRepository;
        this.etudiantRepository = etudiantRepository;
    }

    @PostMapping(path = "/add-recette-etudiant")
    public ResponseEntity<String> addRecetteEtudiant(@RequestBody RecetteRequestEtudiant recetteRequestEtudiant) {
        Etudiant etudiant = etudiantRepository.findById(recetteRequestEtudiant.getEtudiant().getId()).orElseThrow(() -> {throw new RuntimeException("ETUDIANT INTROUVABLE");});
//        Etudiant etudiant = etudiantRepository.save(recetteRequestEtudiant.getEtudiant());
        Recettes recettes = recetteRequestEtudiant.getRecettes();
        recettes.setEtudiant(etudiant);
        recetteRepository.save(recettes);
        Budget budget = Budget.builder().date_paiment(new Date().toString()).montant(recettes.getMontant()).recettes(recettes).build();
        budgetRepository.save(budget);
        LOGGER.info("EFFECTUÉE .............. ");

        return ResponseEntity.ok("METY TSARA KA .... ");
    }

}
