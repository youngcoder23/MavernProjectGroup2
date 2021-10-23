/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.groupadp2;

import java.util.Scanner;

/**
 *
 * @author Anesu Mashinyira 220122024
 */

public class FoodBeneficiaries {
    
        public static void main(String[] args){
        
       
        int nums[] = {22,12,15};
        int i,size;
        int VoucherNumber;
        boolean registerd = false;
        
        size = nums.length;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter your voucher number");
        VoucherNumber = sc.nextInt();
        
        
        for(i = 0; i < size; i++){
            if (nums[i] == VoucherNumber){
                registerd = true;
                break;
                
            }
        }
        if(registerd)
            
            System.out.println(VoucherNumber + " This is what is dued to Lebo");
            
            else
                 System.out.println(VoucherNumber + " Unknown User ");
    }
}