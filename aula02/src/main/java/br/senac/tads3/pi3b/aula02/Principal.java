/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.aula02;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fernando.tsuda
 */
public class Principal {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    if (System.currentTimeMillis() % 2 == 1) {
      System.out.println("Hello world PI3B!!!");
    } else {
       System.out.println("ERRO");
    }
    try {
      Thread.sleep(3L);
    } catch (InterruptedException ex) {
      // TODO: Tratar
    }
    
  }
  
}
