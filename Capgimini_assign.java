/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*Write a java program that simulates a traffic light. The program lets the user select one of three lights: red, yellow, or
  green with radio buttons. On entering the choice, 
an appropriate message with “stop” or “ready” or “go” should appear in the console .
Initially there is no message shown*/
package capgimini_assign;

import java.util.Scanner;

/**
 *
 * @author prakh
 */
public class Capgimini_assign {
    
    public static void main(String[] args) 
    {
        System.out.println("Pls Select the options");
        System.out.println("RED\n"+ "YELLOw\n" +"green\n");
        Scanner sc = new Scanner(System.in);
        String colour = sc.nextLine();
        switch(colour) {
            case "red":
                System.out.println("Stop");
                break;
        case "yellow":
                System.out.println("ready");
        break;
        case "Green":
                System.out.println("ready");
        break;
        
     
}
       
}
}
    

