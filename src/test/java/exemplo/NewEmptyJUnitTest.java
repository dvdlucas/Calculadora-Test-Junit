/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package exemplo;

import com.mycompany.calculadoratestjunit.Calculadora;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    

  @Test
  public void SomarDoisNumerosPositivos(){
       Calculadora calc = new Calculadora();
       int soma = calc.Soma(3,8);     
  }
  @Test
    public void SomarDoisNumerosNegativos(){
       Calculadora calc = new Calculadora();
       int soma = calc.Soma(-3,-8);
   }
    
    @Test
    public void SubtrairDoisNumerosNegativos(){
       Calculadora calc = new Calculadora();
       int sub = calc.Subtrair(-3,-8);
   }
    
    @Test
  public void SubtrairDoisNumerosPositivos(){
       Calculadora calc = new Calculadora();
       int sub = calc.Subtrair(10,8);     
  }
    @Test
  public void MultiplicarDoisNumerosPositivos(){
       Calculadora calc = new Calculadora();
       int mult = calc.Multiplicacao(10,8);     
  }
    @Test
  public void MultiplicarDoisNumerosNegativos(){
       Calculadora calc = new Calculadora();
       int mult = calc.Multiplicacao(-10,-8);     
  }
  
     @Test
  public void DividirDoisNumerosPositivos(){
       Calculadora calc = new Calculadora();
       int div = calc.Divisao(10,8);     
  }
  
     @Test
  public void DividirDoisNumerosNegativos(){
       Calculadora calc = new Calculadora();
       int div = calc.Divisao(-10,-8);     
  }
  
  
  }
