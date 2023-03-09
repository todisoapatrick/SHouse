package com.backend.backend;

import com.backend.backend.entities.*;
import com.backend.backend.payload.Types;
import com.backend.backend.repositories.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class BackendApplication {
    public static Logger LOGGER = LoggerFactory.getLogger(BackendApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    //@Bean
    CommandLineRunner start(DepenseRepository depenseRepository, EnseignantRepository enseignantRepository, BudgetRepository budgetRepository, EtudiantRepository etudiantRepository, RecetteRepository recetteRepository) {
        return args -> {

            Enseignant enseignant = enseignantRepository.save(Enseignant.builder().nom("FANOMEZANA").niveauenseigné("LICENCE").CIN("456789123458")
                    .adresse("Andrainjato").prenom("FANOMEZANA").build());
//            for (int i = 0; i < 10; i++) {


            Etudiant etudiant = etudiantRepository.save(Etudiant.builder().nom("SOLO").prenom("SOANIAINA")
                    .adresse("Andrainjato").build());

            Etudiant etudiant_hafa = etudiantRepository.save(Etudiant.builder().nom("BRUNI").prenom("HERINIAINA")
                    .adresse("Andrainjato").build());

            Recettes recettes = Recettes.builder().daterecette(new Date(System.currentTimeMillis()).toString())
                    .montant(78546.563).description("FRAIS DE SCOLARITE ...").build();
            recettes.setEtudiant(etudiant);


            Recettes recettes_hafa = Recettes.builder().daterecette(new Date(System.currentTimeMillis()).toString())
                    .montant(14666.33).description("FRAIS DE SCOLARITE ...").build();
            recettes_hafa.setEtudiant(etudiant_hafa);

            Recettes recettes1 = recetteRepository.save(recettes);
            Recettes recettes2 = recetteRepository.save(recettes_hafa);

            Budget budget = Budget.builder().date_paiment(new Date().toString()).recettes(recettes1).montant(recettes1.getMontant()).build();
            budgetRepository.save(budget);
            Budget budget_hafa = Budget.builder().date_paiment(new Date().toString()).recettes(recettes2).montant(recettes2.getMontant()).build();
            budgetRepository.save(budget_hafa);


            LOGGER.info("SOMME BUDGET : {}", budgetRepository.getTotalBudget());

//                recettes1.setEtudiant(etudiant);

            double budget_total = budgetRepository.getTotalBudget();

            Depenses depenses = Depenses.builder().types(Types.SALAIRE).budget(budget).montant(45789.23).datedepense(new Date(System.currentTimeMillis())).build();
//                Depenses depenses1 = Depenses.builder().types(Types.DIVERS).budget(budget).description().datedepense(new Date(System.currentTimeMillis())).build();

            Budget budget_depense_1 = Budget.builder().depenses(depenses).montant(depenses.getMontant()).date_paiment(new Date().toString()).build();


            if (depenses.getTypes().toString().equals("SALAIRE")) {
                depenses.setEnseignant(enseignant);
            }
            depenseRepository.save(depenses);
            budgetRepository.save(budget_depense_1);
//            }
        };
    }

}
