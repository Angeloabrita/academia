/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.angeloabrita.academia.model;

/**
 *
 * @author angel
 */

import javax.persistence.*;

@Entity
public class FichaTreino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String exercicio;
    private int repeticoes;
    private double carga;

    @ManyToOne
    @JoinColumn(name = "aluno_id", foreignKey = @ForeignKey(name = "fk_aluno"))
    private Aluno aluno;

    // Getters e Setters
}