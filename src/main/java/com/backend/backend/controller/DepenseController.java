package com.backend.backend.controller;

import com.backend.backend.entities.Depenses;
import com.backend.backend.entities.Recettes;
import com.backend.backend.payload.ResponseRecettes;
import com.backend.backend.payload.ResponsesDepenses;
import com.backend.backend.repositories.DepenseRepository;
import com.backend.backend.repositories.RecetteRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/depenses")
public class DepenseController {
    private final DepenseRepository depenseRepository;

    public DepenseController(DepenseRepository depenseRepository) {
        this.depenseRepository = depenseRepository;
    }

    @GetMapping(path = "/getAll")
    public List<Depenses> getAll() {
        return depenseRepository.findAll();
    }

    @GetMapping(path = "/getById/{idEtudiant}")
    public ResponseEntity<ResponsesDepenses> getById(@PathVariable(name = "idDepense") long id) {
        Depenses depenses =depenseRepository.findById(id).orElseThrow(() -> {throw new RuntimeException("DEPENSE NOT FOUND");});
        return ResponseEntity.ok(ResponsesDepenses.builder().message("UN DEPENSE A ÉTÉ TROUVÉ ... ").depenses(depenses).build());
    }



}
