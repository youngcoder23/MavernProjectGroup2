/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.mavernprojectgroup2;

import java.util.Scanner;

/**
 *  
 * Returns result total votes of String array
 * 
 * @author musaddiq mcwhite
 * student number: 219369151
 */
public class SRCVoter {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("candidates" + "\t" + "votes" + "\n");
        
        String srcNames[] = {"Ay", "Bee", "Cee", "Dee", "Ee", "Eff", "Gee", "Aych", "Eye", "Jay"};
            int votes[] = {25,9,18,22,13,19,3,7,24,8};
            int sum=0;
             
            for (int counter=0; counter<srcNames.length;counter++){
             sum+=votes[counter];
                System.out.println(srcNames[counter]+ "\t" + "\t" + votes[counter] + "\n");
                 
             }
             
            System.out.println("Total votes :" + "\t" + sum + "\n");
           
            String addVote;
            System.out.println("Please type the name of the SRC candidate that deserves your vote ");
            addVote = scn.nextLine();
            sum++;
        
            switch (addVote) {
            
                case "Ay":
                votes[0]++;
                System.out.println(addVote + " now has " + votes[0] + " votes" + "\n");
                break;
                    
                case "Bee":
                votes[1]++;
                System.out.println(addVote + " now has " + votes[1] + " votes" + "\n");
                break;
                    
                case "Cee":
                votes[2]++;
                System.out.println(addVote + " now has " + votes[2] + " votes" + "\n");
                break;
                    
                case "Dee":
                votes[3]++;
                System.out.println(addVote + " now has " + votes[3] + " votes" + "\n");
                break;
                    
                case "Ee":
                votes[4]++;
                System.out.println(addVote + " now has " + votes[4] + " votes" + "\n");
                break;
                    
                case "Eff":
                votes[5]++;
                System.out.println(addVote + " now has " + votes[5] + " votes" + "\n");
                break;
                    
                case "Gee":
                votes[6]++;
                System.out.println(addVote + " now has " + votes[6] + " votes" + "\n");
                break;
                    
                case "Aych":
                votes[7]++;
                System.out.println(addVote + " now has " + votes[7] + " votes" + "\n");
                break;
                    
                case "Eye":
                votes[8]++;
                System.out.println(addVote + " now has " + votes[8] + " votes" + "\n");
                break;
                    
                case "Jay":
                votes[9]++;
                System.out.println(addVote + " now has " + votes[9] + " votes" + "\n");
                break;
                
                default:
                    System.out.println("Please type in a valid name");
            }
            System.out.println("New total of votes casted = "+ sum);
            
    }
}
