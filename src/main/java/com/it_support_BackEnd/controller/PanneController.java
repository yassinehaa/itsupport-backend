package com.it_support_BackEnd.controller;


import com.it_support_BackEnd.Services.PanneService;
import com.it_support_BackEnd.dto.PanneDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pannes")
@CrossOrigin(origins = "*")
public class PanneController {
    @Autowired
    private PanneService panneService;

    @PostMapping("/create-panne")
    public ResponseEntity<?> createPanne(@RequestBody PanneDto panneDto) {
        try {
            var panne = panneService.create(panneDto);
            return ResponseEntity.status(HttpStatus.CREATED).body(panne);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePanne(@PathVariable("id") int id) {
        panneService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<PanneDto>> getAllPannes() {
        List<PanneDto> pannes = panneService.getAll();
        return ResponseEntity.ok(pannes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PanneDto> getPanneById(@PathVariable("id") int id) {
        PanneDto panneDto = panneService.getPanneById(id);
        if (panneDto != null) {
            return ResponseEntity.ok(panneDto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<PanneDto> updatePanne(@PathVariable("id") int id, @RequestBody PanneDto panneDto) {
        PanneDto updatePanne = panneService.update(id, panneDto);
        if (updatePanne != null) {
            return ResponseEntity.ok(updatePanne);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
