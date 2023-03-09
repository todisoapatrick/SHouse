package com.backend.backend.controller;

import com.backend.backend.entities.Enseignant;
import com.backend.backend.entities.Etudiant;
import com.backend.backend.payload.ResponseEnseignant;
import com.backend.backend.payload.ResponseEtudiant;
import com.backend.backend.repositories.EnseignantRepository;
import com.backend.backend.repositories.EtudiantRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/enseignant")
public class EnseignantController {
    private final EnseignantRepository enseignantRepository;

    public EnseignantController (EnseignantRepository enseignantRepository) {
        this.enseignantRepository = enseignantRepository;
    }

    @GetMapping(path = "/getAll")
    public List<Enseignant> getAll() {
        return enseignantRepository.findAll();
    }

    @GetMapping(path = "/getById/{idEnseignant}")
    public ResponseEntity<ResponseEnseignant> getById(@PathVariable(name = "idEnseignant") long id) {
        Enseignant enseignant = enseignantRepository.findById(id).orElseThrow(() -> {throw new RuntimeException("ENSEIGNANT NOT FOUND");});
        return ResponseEntity.ok(ResponseEnseignant.builder().message("UN ENSEIGNANT A ÉTÉ TROUVÉ ... ").enseignant(enseignant).build());
    }

    @DeleteMapping(path = "/deleteEnseignant/{idEnseignant}")
    public ResponseEntity<ResponseEnseignant> deleteById(@PathVariable(name = "idEnseignant") long id) {
        Enseignant enseignant = getById(id).getBody().getEnseignant();
        enseignantRepository.deleteById(id);
        return ResponseEntity.ok(ResponseEnseignant.builder().message("ÉNSEIGNANT SUPPRIMÉ AVEC SUCCÈS !!").enseignant(enseignant).build());
    }

    @PutMapping(path = "/update/{idEnseignant}")
    public ResponseEntity<ResponseEnseignant> updateById(@PathVariable(name = "idEnseignant") long id, @RequestBody Enseignant enseignant) {
        Enseignant existingEnseignant = getById(id).getBody().getEnseignant();

        Enseignant enseignant1 = Enseignant.builder().adresse(enseignant.getAdresse()).nom(enseignant.getNom()).prenom(enseignant.getPrenom())
                .CIN(enseignant.getCIN()).niveauenseigné(enseignant.getNiveauenseigné()).id(id).build();

        return ResponseEntity.ok(ResponseEnseignant.builder().message("ÉNSEIGNANT MODIFIÉE AVEC SUCCÈS !!").enseignant(enseignantRepository.save(enseignant1)).build());
    }

    @PostMapping(path = "/add")
    public ResponseEntity<ResponseEnseignant> addNewStudent(@RequestBody Enseignant enseignant) {
        return ResponseEntity.ok(ResponseEnseignant.builder().message("ÉNSEIGNANT AJOUTÉE AVEC SUCCÈS !!").enseignant(enseignantRepository.save(enseignant)).build());
    }

}
