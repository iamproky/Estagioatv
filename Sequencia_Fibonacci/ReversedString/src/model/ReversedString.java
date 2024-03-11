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
public class ReversedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();
        
        String reversed = reverseString(input);
        
        System.out.println("String invertida: " + reversed);
        
        scanner.close();
    }
    
    // Método para inverter uma string
    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        
        while (left < right) {
            // Troca os caracteres
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            
            // Move os ponteiros
            left++;
            right--;
        }
        
        // Converte o array de caracteres de volta para uma string
        return new String(chars);
    }
}