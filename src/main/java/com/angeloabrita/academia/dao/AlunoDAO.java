/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.angeloabrita.academia.dao;

/**
 *
 * @author angel
 *
 */

import com.angeloabrita.academia.model.Aluno;
import com.angeloabrita.academia.until.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


import java.util.List;

public class AlunoDAO {

    public void salvar(Aluno aluno) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(aluno);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

  public List<Aluno> listarTodos() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Aluno> query = session.createQuery("from Aluno", Aluno.class);
            List<Aluno> alunos = query.list();
            System.out.println("Lista de alunos: " + alunos);  // Adicionando log
            return alunos;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Aluno buscarPorId(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Aluno.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
   public Aluno buscarPorNome(String nome) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "FROM Aluno WHERE nome = :nome";
            Query<Aluno> query = session.createQuery(hql, Aluno.class);
            query.setParameter("nome", nome);
            List<Aluno> results = query.getResultList();
            return results.isEmpty() ? null : results.get(0); // Retorna o primeiro resultado ou null se não encontrar
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    public void atualizar(Aluno aluno) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(aluno);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void deletar(Long id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Aluno aluno = session.get(Aluno.class, id);
            if (aluno != null) {
                session.delete(aluno);
                transaction.commit();
            }
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
