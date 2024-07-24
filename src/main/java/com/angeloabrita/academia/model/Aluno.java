/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.angeloabrita.academia.model;

/**
 *
 * @author angel
 */
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String foneCelular;
    private String email;
    private LocalDate dataNascimento;
    private String cep;
    private String logradouro;
    private double peso;
    private double altura;
    private int frequenciaSemanal;

    @ManyToOne
    @JoinColumn(name = "responsavel_id", foreignKey = @ForeignKey(name = "fk_responsavel"))
    private ResponsavelLegal responsavelLegal;

    @OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL)
    private List<FichaTreino> fichasTreino;

    // Getters e Setters
     public Long getId() {
        return id;
    }

  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFoneCelular() {
        return foneCelular;
    }

    public void setFoneCelular(String foneCelular) {
        this.foneCelular = foneCelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getFrequenciaSemanal() {
        return frequenciaSemanal;
    }

    public void setFrequenciaSemanal(int frequenciaSemanal) {
        this.frequenciaSemanal = frequenciaSemanal;
    }

    public ResponsavelLegal getResponsavelLegal() {
        return responsavelLegal;
    }

    public void setResponsavelLegal(ResponsavelLegal responsavelLegal) {
        this.responsavelLegal = responsavelLegal;
    }

    public List<FichaTreino> getFichasTreino() {
        return fichasTreino;
    }

    public void setFichasTreino(List<FichaTreino> fichasTreino) {
        this.fichasTreino = fichasTreino;
    }
    
}