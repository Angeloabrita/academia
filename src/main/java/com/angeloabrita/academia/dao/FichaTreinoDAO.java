/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.angeloabrita.academia.dao;

/**
 *
 * @author angel
 */
import com.angeloabrita.academia.model.FichaTreino;
import com.angeloabrita.academia.until.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;


public class FichaTreinoDAO {
    public void salvar(FichaTreino fichaTreino) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(fichaTreino);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public List<FichaTreino> listarTodos() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from FichaTreino", FichaTreino.class).list();
        }
    }
}
