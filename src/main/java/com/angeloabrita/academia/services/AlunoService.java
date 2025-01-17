/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.angeloabrita.academia.services;

/**
 *
 * @author angel
 */

import com.angeloabrita.academia.dao.AlunoDAO;
import com.angeloabrita.academia.model.Aluno;

import java.util.List;

public class AlunoService {
    private AlunoDAO alunoDAO = new AlunoDAO();

    public void salvar(Aluno aluno) {
        
        alunoDAO.salvar(aluno);
        //calcularImc(aluno);
        //definirPlano(aluno);
    }

    public List<Aluno> listarTodos() {
        return alunoDAO.listarTodos();
    }
    
    //verifica o retorno da lista #bug exceptionNull
    public boolean isListaDeAlunos(List<?> lista) {
        return lista != null && !lista.isEmpty() && lista.get(0) instanceof Aluno;
    }

    public String calcularImc(Aluno aluno) {
        double imc = aluno.getPeso() / (aluno.getAltura() * aluno.getAltura());
        return definirClassificacaoImc(imc);
    }

    private String definirClassificacaoImc(double imc) {
        if (imc < 18.5) return "Baixo peso";
        else if (imc < 24.9) return "Peso normal";
        else if (imc < 29.9) return "Sobrepeso";
        else if (imc < 34.9) return "Obecidade grau I";
        else if (imc < 39.9) return "Obecidade grau II";

        else return "Obesidade grau III";
    }

    private void definirPlano(Aluno aluno) {       
        // Lógica para definir o plano e a mensalidade do aluno
        
    }
}
