/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avenger;

import java.util.Scanner;
/**
 *
 * @author Narsing
 */
public class Avenger {
    Scanner sc=new Scanner(System.in);
    String name,wepon,planet;
    int age,power;
    public void getDetails()
    {
      System.out.println("Enter the name of avenger");
      name=sc.next();
      System.out.println("Enter the age of Avenger");
      age=sc.nextInt();
       System.out.println("Enter the wepon of Avenger");
      wepon=sc.next();
       System.out.println("Enter the power  rating betwean 1 to 5 of Avenger");
      power=sc.nextInt();
       System.out.println("Enter the pannet of Avenger");
      planet=sc.next();
     }
    public void displayDetails(){
        System.out.println("Avenger name is  "+name);
         System.out.println("Avenger age  "+age);
          System.out.println("Avenger wepon  "+wepon);
           System.out.println(" power of Avenger  "+power);
            System.out.println("pannet of avenger  "+planet);
            
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Avenger[] avenger = new Avenger[5]; 
        for(int i=0;i<5;i++){
            avenger[i]=new Avenger();
          // avenger[i].getDetails();
           
        }
        
         for(int i=0;i<5;i++){
             avenger[i].getDetails();
           
            avenger[i].displayDetails();
             System.out.println();
        }
     /* Avenger av=new Avenger();
      av.getDetails();
      av.displayDetails();*/
    }

    
}
