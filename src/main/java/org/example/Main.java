package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=s.nextInt();
        if(n==1 || n==0) System.out.println("Neither");
        for(int i=2;i<n/2+1;i++){
            if(n%i==0){
                System.out.println("Composite!");
                return;
            }
        }
        System.out.println("Prime!");
        return;
    }
}
