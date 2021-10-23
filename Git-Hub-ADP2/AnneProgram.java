/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.groupadp2;

/**
 *
 * @author Anesu Mashinyira 220122024
 */
public class AnneProgram {
   int number;
 
   
   public AnneProgram() {
      this.number = 0;
   }

   public AnneProgram(int number) {
      this.number = number;
   }
 
   
   public int getNumber() {
      return number;
   }
 
   public void setNumber(int number) {
      this.number = number;
   }
 
   
   public AnneProgram add(AnneProgram rhs) {
      this.number += rhs.number;
      return this;
   }
 
   public AnneProgram div(AnneProgram rhs) {
      if (rhs.number == 0) throw new IllegalArgumentException("Cannot divide by 0!");
      this.number /= rhs.number;
      return this;
   }
}