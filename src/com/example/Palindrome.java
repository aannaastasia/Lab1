package com.example;
//Класс для поиска палиндромов
public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++){
            String s = args[i];
            if (isPalindrome(s))
                System.out.println(s + " is palindrome");
            else
                System.out.println(s + " isn't palindrome");
        }
    }
    //Метод для полного изменения символов в строке
    public static String reverseString(String s){
        String n = "";
        for (int i = s.length() -1; i >= 0; i--)
            n += s.charAt(i);
        return n;
    }
    //Метод для сравнения с первоначальными данными
    public static boolean isPalindrome(String s){
        return reverseString(s).equals(s);
    }

}
