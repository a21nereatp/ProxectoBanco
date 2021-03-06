/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package proxecto.proxectobanco;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class ContaTest {
    
    public ContaTest() {
    }

    @Test
    public void testRetirar() {
        System.out.println("retirar");
        float valor = 100F;
        Conta instance = new Conta();
        boolean expResult = true;
        boolean result = instance.retirar(valor);
        assertEquals(expResult, result);
    }
    @Test
    public void testRetirar2() {
        System.out.println("retirar");
        float valor = 2000F;
        Conta instance = new Conta();
        boolean expResult = false;
        boolean result = instance.retirar(valor);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIngresar() {
        System.out.println("ingresar");
        float valor = 300F;
        Conta instance = new Conta();
        instance.ingresar(valor);
    }
    
}
