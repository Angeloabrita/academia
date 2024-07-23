/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package com.angeloabrita.academia.services;

/**
 *
 * @author angel
 */

import com.angeloabrita.academia.dao.FichaTreinoDAO;
import com.angeloabrita.academia.model.FichaTreino;

import java.util.List;


public class FichaTreinoService {
    private FichaTreinoDAO fichaTreinoDAO = new FichaTreinoDAO();

    public void salvar(FichaTreino fichaTreino) {
        fichaTreinoDAO.salvar(fichaTreino);
    }

    public List<FichaTreino> listarTodos() {
        return fichaTreinoDAO.listarTodos();
    }
}