/*
 * Basic Calculator 
 * @author: Randelle Michel
 * 2017
 * Software Engineering
*/
import java.util.Scanner;

public class Calculator{
  public static void main(String [] args){
    double x, y, z;
    int op;
    
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the first value, second value and operation (1: addition, 2:subtraction, 3:multiplication, 4:division");
    x = keyboard.nextDouble();
    y = keyboard.nextDouble();
    op = keyboard.nextInt();
    
    //addition
    if(op == 1){
      z = x + y;
      System.out.println("result: "+ z);
    }

    //substraction
    else if(op == 2){
      z = x - y;
      System.out.println("result: "+ z);
    }

    //multiplication
    else if(op == 3){
      z = x * y;
      System.out.println("result: "+ z);
    }
}