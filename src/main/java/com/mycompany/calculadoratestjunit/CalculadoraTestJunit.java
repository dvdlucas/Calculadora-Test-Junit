
package com.mycompany.calculadoratestjunit;

import org.junit.jupiter.api.Test;
public class CalculadoraTestJunit {
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
