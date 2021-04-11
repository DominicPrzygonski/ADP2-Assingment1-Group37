/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.sinentlahlapindani_219081328;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class CalculateTest {
    
    public CalculateTest() {
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
     * Test of add method, of class Calculate.
     */
     @Test
    public void testEquality() {
     System.out.println("add") ;
     String s1="5";
     String s2="5";
     Calculate test=new Calculate();
     int expResult=10;
     int result=test.add(s1, s2);
     assertEquals(expResult,result);
     
    }
    @Test
    public void testIdentity() {
     System.out.println("add") ;
     String s1="5";
     String s2="5";
     Calculate test=new Calculate();
     int expResult=10;
     int result=test.add(s1, s2);
   assertSame(expResult,result);
    }
    @Test
    public void testFailing() {
     System.out.println("add") ;
     String s1="5";
     String s2="5";
     Calculate test=new Calculate();
     int expResult=10;
     int result=test.add(s1, s2);
     
    fail("I'm sure this test will fail.");
    }
    @Test
    public void testTimeout() {
     System.out.println("add") ;
     String s1="5";
     String s2="5";
     int timeout=11;
     Calculate test=new Calculate();
     int expResult=10;
     int result=test.add(s1, s2);
   while(true);} 
}
