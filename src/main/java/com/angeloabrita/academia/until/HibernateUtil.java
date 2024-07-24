/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.angeloabrita.academia.until;

/**
 *
 * @author angel
 */
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            // Cria uma configuração padrão que busca o hibernate.cfg.xml no classpath
            return new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Exibe uma mensagem de erro se a criação da fábrica de sessões falhar
            ex.printStackTrace();
            System.err.println("FALHOU AO CONECTAR AO BD: " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        // Fecha caches e pools de conexões
        getSessionFactory().close();
    }
}