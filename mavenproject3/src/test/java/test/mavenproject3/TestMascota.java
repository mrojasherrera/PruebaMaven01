/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.mavenproject3;

import com.mycompany.mavenproject3.Mascota;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jmaldonado
 */
public class TestMascota {
   @TestClass //tiene que haber 
    public TestMascota() {
        
        pepita.come()
        Assert.assertEquals(2, 0, 0);//aser
    }
    //antes de ejecutar cada test
    @BeforeClass //primero pasa por aca
    public static void setUpClass() {
        //se crea una instancia
        Mascota pepita=new Mascota(pepita, 0, 4);
    }
    //despues de ejecutar cada test
    @AfterClass
    public static void tearDownClass() {
        
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
