/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


/**
 *
 * @author sj063533
 */
public class OrangeTest {
    
    Orange o1;
    Orange o2;
    public OrangeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        o1=new Orange("Lalaland",15.20);
        o2= new Orange();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPrix method, of class Orange.
     */
    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        Orange instance = new Orange();
        double expResult = 5000;
        double result = instance.getPrix();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOrigine method, of class Orange.
     */
    @Test
    public void testGetOrigine() {
        System.out.println("getOrigine");
        Orange instance = o1;
        String expResult = "Lalaland";
        Orange instance2=o2;
        String expResult2="Ludostan";
        String result = instance.getOrigine();
        String result2=instance2.getOrigine();
        Assert.assertTrue(result.equals(expResult)&&result2.equals(expResult2));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPrix method, of class Orange.
     */
    @Test
    public void testSetPrix() {
        System.out.println("setPrix");
        int prix = 1200;
        Orange instance = o1;
        instance.setPrix(prix);
        Assert.assertTrue(prix==instance.getPrix());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOrigine method, of class Orange.
     */
    @Test
    public void testSetOrigine() {
        System.out.println("setOrigine");
        String origine = "Flappy";
        Orange instance = new Orange();
        instance.setOrigine(origine);
        assertTrue(instance.getOrigine().equals("Flappy"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Orange.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Orange instance = new Orange();
        String expResult = "L'orange coute " + instance.getPrix() + " et vient de " + instance.getOrigine();
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
