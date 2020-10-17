/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignment4_2;

/**
 *
 * @author Narsing
 */
//import java.util.Scanner;
public class Asignment4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // Scanner sc=new Scanner(System.in);
       int[] arr=new int[5];
       arr[0]=35;
       arr[1]=45;
       arr[2]=60;
       arr[3]=55;
       arr[4]=40;
        /* System.out.println("enter the values for arrays");
         for(int i=0;i<5;i++)
         {
            arr[i]=sc.nextInt();
           // System.out.println(arr[i]);
         }*/
         System.out.println("in array odd values are");
          for(int i=0;i<5;i++)
         {
           if(arr[i]%2!=0){
              System.out.println(arr[i]);  
            }
             
         }
    }
    
}
