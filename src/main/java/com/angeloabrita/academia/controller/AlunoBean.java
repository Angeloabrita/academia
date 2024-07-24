/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.angeloabrita.academia.controller;

/**
 *
 * @author angel
 */

import com.angeloabrita.academia.model.Aluno;
import com.angeloabrita.academia.services.AlunoService;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;


import java.io.Serializable;
import java.util.List;


@RequestScoped
public class AlunoBean implements Serializable {
    private Aluno aluno = new Aluno();
    private List<Aluno> alunos;

   
    private AlunoService alunoService;

    @PostConstruct
    public void init() {
        alunos = alunoService.listarTodos();
    }

    public void salvar() {
        alunoService.salvar(aluno);
        aluno = new Aluno();
        alunos = alunoService.listarTodos();
    }

    // Getters e Setters
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}