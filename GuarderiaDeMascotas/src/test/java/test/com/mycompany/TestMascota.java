/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.java.test.com.mycompany;

import static org.junit.Assert.*;

import org.junit.Before;

import junit.framework.Assert;
import main.java.com.mycompany.Mascota;

/**
 *
 * @author jmaldonado
 */
public class TestMascota {
    
    @Before
    public void initialize() {
    	Mascota pepita =new Mascota("pepita", 0, 4);
    }
    
     @Test
     public void TestMascotaCome(){
         pepita.come();
         Assert.assertEquals(2, pepita.energia);//aser     }
}
