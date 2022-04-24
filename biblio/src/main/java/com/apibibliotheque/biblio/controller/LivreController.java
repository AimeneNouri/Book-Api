package com.apibibliotheque.biblio.controller;

import com.apibibliotheque.biblio.entities.Livre;
import com.apibibliotheque.biblio.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/emsi_api")
public class LivreController {

    @Autowired
    private LivreService livreService;

    // GET http://localhost:8080/emsi_api/livres
    @GetMapping("/livres")
    public List<Livre> findAllLivres(){
        return livreService.getAllLivres();
    }

    // GET http://localhost:8080/emsi_api/livres/{id}
    @GetMapping(path = "/livres/{id}")
    public Livre findLivreById(@PathVariable Long id){
        return livreService.getLivreById(id);
    }

    // Ajout d'un nouveau Livre
    @PostMapping("/add")
    public ResponseEntity<String> updateLivre(@RequestBody Livre livre){
        livreService.saveLivre(livre);
        return ResponseEntity.ok("Added Successfully");
    }

    // Modification d'un Livre
    @PutMapping("/livres/{id}")
    public ResponseEntity<String> updateLivre(@PathVariable Long id, @RequestBody Livre livreDetails){
        livreService.updateLivre(livreService.getLivreById(id), livreDetails);
        return ResponseEntity.ok("Updated Successfully");
    }

    // Suppression d'un Livre
    @DeleteMapping("/livres/{id}")
    public ResponseEntity<String> removeLire(@PathVariable Long id){
        livreService.removeLivreById(id);
        return ResponseEntity.ok("Deleted Successfuly");
    }
}
