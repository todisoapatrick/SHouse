package com.backend.backend.controller;


import com.backend.backend.entities.Etudiant;
import com.backend.backend.payload.ResponseEtudiant;
import com.backend.backend.repositories.EtudiantRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/etudiant")
public class EtudiantController {


    private final EtudiantRepository etudiantRepository;

    public EtudiantController(EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }

    @GetMapping(path = "/getAll")
    public List<Etudiant> getAll() {
        return etudiantRepository.findAll();
    }

    @GetMapping(path = "/getById/{idEtudiant}")
    public ResponseEntity<ResponseEtudiant> getById(@PathVariable(name = "idEtudiant") long id) {
        Etudiant etudiant22 =etudiantRepository.findById(id).orElseThrow(() -> {throw new RuntimeException("ETUDIANT NOT FOUND");});
        return ResponseEntity.ok(ResponseEtudiant.builder().message("UN ÉTUDIANT A ÉTÉ TROUVÉ ... ").etudiant(etudiant22).build());
    }

    @DeleteMapping(path = "/deleteEtudiant/{idEtudiant}")
    public ResponseEntity<ResponseEtudiant> deleteById(@PathVariable(name = "idEtudiant") long id) {
        Etudiant etudiant = getById(id).getBody().getEtudiant();
        etudiantRepository.deleteById(id);
        return ResponseEntity.ok(ResponseEtudiant.builder().message("ÉTUDIANT SUPPRIMÉ AVEC SUCCÈS !!").etudiant(etudiant).build());
    }

    @PutMapping(path = "/update/{idEtudiant}")
    public ResponseEntity<ResponseEtudiant> updateById(@PathVariable(name = "idEtudiant") long id, @RequestBody Etudiant etudiant) {
        Etudiant existingEtudiant = getById(id).getBody().getEtudiant();

        Etudiant etudiant1 = Etudiant.builder().adresse(etudiant.getAdresse()).nom(etudiant.getNom()).prenom(etudiant.getPrenom())
                .CIN(etudiant.getCIN()).id(id).build();

        return ResponseEntity.ok(ResponseEtudiant.builder().message("ÉTUDIANT MODIFIÉE AVEC SUCCÈS !!").etudiant(etudiantRepository.save(etudiant1)).build());
    }

    @PostMapping(path = "/add")
    public ResponseEntity<ResponseEtudiant> addNewStudent(@RequestBody Etudiant etudiant) {
        return ResponseEntity.ok(ResponseEtudiant.builder().message("ÉTUDIANT AJOUTÉE AVEC SUCCÈS !!").etudiant(etudiantRepository.save(etudiant)).build());
    }

}
