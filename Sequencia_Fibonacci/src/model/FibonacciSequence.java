/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Scanner;

/**
 *
 * @author pcgamergab
 */
public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int num = scanner.nextInt();
        
        if (isFibonacci(num)) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
        
        scanner.close();
    }
    
    // Método para verificar se um número pertence à sequência de Fibonacci
    public static boolean isFibonacci(int num) {
        int a = 0;
        int b = 1;
        
        while (b < num) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        
        return b == num;
    }
}
