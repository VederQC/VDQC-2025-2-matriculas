package com.example.vdqc_matricula.controller;

import com.example.vdqc_matricula.entity.Matricula;
import com.example.vdqc_matricula.service.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matricula")
public class MatriculaController {
    @Autowired
    MatriculaService matriculaService;

    @GetMapping
    public List<Matricula> listar() {
        return matriculaService.listar();
    }

    @GetMapping("/{id}")
    public Matricula buscarPorId(@PathVariable Integer id) {
        return matriculaService.buscarPorId(id).get();
    }

    @PostMapping
    public Matricula guardar(@RequestBody Matricula categoria) {
        return matriculaService.guardar(categoria);
    }

    @PutMapping
    public Matricula actualizar(@RequestBody Matricula categoria) {
        return matriculaService.actualizar(categoria);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Integer id) {
        matriculaService.borrarPorId(id);
        return "Categoria eliminada";
    }

}
