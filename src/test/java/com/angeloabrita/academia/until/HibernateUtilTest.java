/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.angeloabrita.academia.until;

import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class HibernateUtilTest {
    
    public HibernateUtilTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getSessionFactory method, of class HibernateUtil.
     */
    @Test
    public void testGetSessionFactory() {
        System.out.println("getSessionFactory");
        SessionFactory result = HibernateUtil.getSessionFactory();
        assertNotNull("A SessionFactory deveria ser criada", result);
    }

    /**
     * Test of shutdown method, of class HibernateUtil.
     */
    @Test
    public void testShutdown() {
        System.out.println("shutdown");
        HibernateUtil.shutdown();
        assertTrue("A SessionFactory deveria estar fechada", HibernateUtil.getSessionFactory().isClosed());
    }
}