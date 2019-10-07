/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*<3 Sarah <3*//*<3 Sarah <3*//*<3 Sarah <3*//*<3 Sarah <3*//*<3 Sarah <3*//*<3 Sarah <3*//*<3 Sarah <3*//*<3 Sarah <3*//*<3 Sarah <3*//*<3 Sarah <3*//*<3 Sarah <3*//*<3 Sarah <3*//*<3 Sarah <3*//*<3 Sarah <3*//*<3 Sarah <3*//*<3 Sarah <3*//*<3 Sarah <3*//*<3 Sarah <3*/
package fr.ufrsciencestech.panier;

import java.util.ArrayList;
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
public class PanierTest {
    Panier p_vide3;
    Panier p_plein3;
    Panier p_presque_plein3;
    Orange mock_o1;
    Orange mock_o2;
    Orange o1;
    Orange o2;
    
    public PanierTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws PanierPleinException {
        p_vide3=new Panier(3);
        p_plein3=new Panier(3);
        p_presque_plein3=new Panier(3);
        mock_o1=mock(Orange.class);
        mock_o2=mock(Orange.class);
        when(mock_o1.getPrix()).thenReturn(0.50);
        when(mock_o2.getPrix()).thenReturn(0.70);
        p_plein3.ajoute(mock_o1);
        p_plein3.ajoute(mock_o1);
        p_plein3.ajoute(mock_o2);
        p_presque_plein3.ajoute(mock_o1);
        p_presque_plein3.ajoute(mock_o2);

    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTailleMaxPanier method, of class Panier.
     */
    @Test
    public void testGetTailleMaxPanier() {
        System.out.println("getTailleMaxPanier");
        Panier instance = null;
        int expResult = 0;
        int result = instance.getTailleMaxPanier();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetPrixPanierVide(){
        float expected=0;
        float result=p_vide3.getPrix();
        assertTrue(expected==result);
    }
    
    @Test
    public void testGetPrixPanierPlein(){
        float expected=(float) 1.70;
        float result=p_plein3.getPrix();
        assertTrue(expected==result);
    }
    @Test
    public void testGetPrixPanierPresquePlein(){
        float expected=(float) 1.20;
        float result=p_presque_plein3.getPrix();
        assertTrue(expected==result);
    }


    /**
     * Test of ajoute method, of class Panier.
     */
    @Test 
    public void testAjoutePanierVide() throws PanierPleinException {
        p_vide3.ajoute(mock_o1);
        assertTrue(p_vide3.getNbFruitsPanier()==1); 
        assertEquals(p_vide3.getListeOrange().get(0),mock_o1);
        assertTrue(p_vide3.getListeOrange().get(0).getPrix()==0.50);
    }
    
    @Test
    public void testAjoutePanierPresquePlein() throws PanierPleinException {
        p_presque_plein3.ajoute(mock_o1);
        assertTrue(p_presque_plein3.getNbFruitsPanier()==3); 
        assertEquals(p_presque_plein3.getListeOrange().get(2),mock_o1);
        assertTrue(p_presque_plein3.getListeOrange().get(2).getPrix()==0.50);
    }
    @Test (expected=PanierPleinException.class)
    public void testAjoutePanierPlein() throws PanierPleinException {
      p_plein3.ajoute(mock_o1);
    }
    /**
     * Test of retire method, of class Panier.
     */
    @Test 
    public void testRetire() {
        System.out.println("retire");
        Panier instance = null;
        boolean expResult = false;
        boolean result = instance.retire();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
