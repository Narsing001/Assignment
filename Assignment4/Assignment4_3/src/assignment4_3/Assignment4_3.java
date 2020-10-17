 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4_3;

/**
 *
 * @author Narsing
 */
import java.util.Scanner;
public class Assignment4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
       int[] arr=new int[5];
         System.out.println("enter the values for arrays");
         for(int i=0;i<5;i++)
         {
            arr[i]=sc.nextInt();
           // System.out.println(arr[i]);
         }
         System.out.println("addition of array is ");
        int add;
        add=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
        
       System.out.println("addition ="+add);
                }
    
}
