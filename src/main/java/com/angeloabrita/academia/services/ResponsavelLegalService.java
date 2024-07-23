/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.angeloabrita.academia.services;

/**
 *
 * @author angel
 */

import com.angeloabrita.academia.dao.ResponsavelLegalDAO;
import com.angeloabrita.academia.model.ResponsavelLegal;

import java.util.List;


public class ResponsavelLegalService {
    private ResponsavelLegalDAO responsavelLegalDAO = new ResponsavelLegalDAO();

    public void salvar(ResponsavelLegal responsavelLegal) {
        responsavelLegalDAO.salvar(responsavelLegal);
    }

    public List<ResponsavelLegal> listarTodos() {
        return responsavelLegalDAO.listarTodos();
    }
}
