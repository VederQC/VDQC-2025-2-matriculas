package com.example.vdqc_matricula.service.impl;

import com.example.vdqc_matricula.entity.Matricula;
import com.example.vdqc_matricula.repository.MatriculaRepository;
import com.example.vdqc_matricula.service.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatriculaServiceImpl implements MatriculaService {
    @Autowired
    private MatriculaRepository matriculaRepository;
    @Override
    public List<Matricula> listar() {
        return matriculaRepository.findAll();
    }

    @Override
    public Optional<Matricula> buscarPorId(Integer id) {
        return matriculaRepository.findById(id);
    }

    @Override
    public Matricula guardar(Matricula categoria) {
        return matriculaRepository.save(categoria);
    }

    @Override
    public Matricula actualizar(Matricula categoria) {
        return matriculaRepository.save(categoria);
    }

    @Override
    public void borrarPorId(Integer id) {
        matriculaRepository.deleteById(id);
    }

}
