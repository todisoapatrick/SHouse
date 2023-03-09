package com.backend.backend.controller;

import com.backend.backend.entities.Etudiant;
import com.backend.backend.entities.Recettes;
import com.backend.backend.payload.ResponseEtudiant;
import com.backend.backend.payload.ResponseRecettes;
import com.backend.backend.repositories.EtudiantRepository;
import com.backend.backend.repositories.RecetteRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/recette")
public class RecetteController {
    private final RecetteRepository recetteRepository;

    public RecetteController(RecetteRepository recetteRepository) {
        this.recetteRepository = recetteRepository;
    }

    @GetMapping(path = "/getAll")
    public List<Recettes> getAll() {
        return recetteRepository.findAll();
    }

    @GetMapping(path = "/getById/{idEtudiant}")
    public ResponseEntity<ResponseRecettes> getById(@PathVariable(name = "idRecette") long id) {
        Recettes recettes =recetteRepository.findById(id).orElseThrow(() -> {throw new RuntimeException("RECETTE NOT FOUND");});
        return ResponseEntity.ok(ResponseRecettes.builder().message("UN RECETTE A ÉTÉ TROUVÉ ... ").recettes(recettes).build());
    }




}
