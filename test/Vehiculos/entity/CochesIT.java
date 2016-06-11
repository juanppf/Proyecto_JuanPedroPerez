/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos.entity;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JuanPe
 */
public class CochesIT {
    
    public CochesIT() {
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
     * Test of getKilometros method, of class Coches.
     */
    @Test
    public void testGetKilometros() {
         try {
        System.out.println("getKilometros");
        Coches instance = new Coches();
        instance.setKilometros("error");
        int expResult = 123459;
        String result = instance.getKilometros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
       
            
        } catch (Exception ex) {
            Logger.getLogger(CochesIT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of setKilometros method, of class Coches.
     */
    @Test
    public void testSetKilometros() {
        System.out.println("setKilometros");
        String kilometros = "";
        Coches instance = new Coches();
        instance.setKilometros(kilometros);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOperario method, of class Coches.
     */
    @Test
    public void testGetOperario() {
        System.out.println("getOperario");
        Coches instance = new Coches();
        String expResult = "";
        String result = instance.getOperario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOperario method, of class Coches.
     */
    @Test
    public void testSetOperario() {
        System.out.println("setOperario");
        String operario = "";
        Coches instance = new Coches();
        instance.setOperario(operario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdVehiculo method, of class Coches.
     */
    @Test
    public void testGetIdVehiculo() {
        System.out.println("getIdVehiculo");
        Coches instance = new Coches();
        Integer expResult = null;
        Integer result = instance.getIdVehiculo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdVehiculo method, of class Coches.
     */
    @Test
    public void testSetIdVehiculo() {
        System.out.println("setIdVehiculo");
        Integer idVehiculo = null;
        Coches instance = new Coches();
        instance.setIdVehiculo(idVehiculo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMatricula method, of class Coches.
     */
    @Test
    public void testGetMatricula() {
        System.out.println("getMatricula");
        Coches instance = new Coches();
        String expResult = "";
        String result = instance.getMatricula();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMatricula method, of class Coches.
     */
    @Test
    public void testSetMatricula() {
        System.out.println("setMatricula");
        String matricula = "";
        Coches instance = new Coches();
        instance.setMatricula(matricula);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModelo method, of class Coches.
     */
    @Test
    public void testGetModelo() {
        System.out.println("getModelo");
        Coches instance = new Coches();
        String expResult = "";
        String result = instance.getModelo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModelo method, of class Coches.
     */
    @Test
    public void testSetModelo() {
        System.out.println("setModelo");
        String modelo = "";
        Coches instance = new Coches();
        instance.setModelo(modelo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReparacion method, of class Coches.
     */
    @Test
    public void testGetReparacion() {
        System.out.println("getReparacion");
        Coches instance = new Coches();
        String expResult = "";
        String result = instance.getReparacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReparacion method, of class Coches.
     */
    @Test
    public void testSetReparacion() {
        System.out.println("setReparacion");
        String reparacion = "";
        Coches instance = new Coches();
        instance.setReparacion(reparacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaRep method, of class Coches.
     */
    @Test
    public void testGetFechaRep() {
        System.out.println("getFechaRep");
        Coches instance = new Coches();
        String expResult = "";
        String result = instance.getFechaRep();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaRep method, of class Coches.
     */
    @Test
    public void testSetFechaRep() {
        try{
        System.out.println("setFechaRep");
        String fechaRep = "12/12/16";
        Coches instance = new Coches();
        instance.setFechaRep(fechaRep);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        } catch (Exception ex) {
            Logger.getLogger(CochesIT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
