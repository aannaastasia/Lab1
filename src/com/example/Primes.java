package com.example;
//Класс для поиска и вывода всех простых чисел меньше 100
public class Primes {
    public static void main(String[] args){
        for (int i = 2; i <= 100; i++){
            if (isPrime(i))
               System.out.println(i);
        }
    }
    //Метод для проверки является ли аргумент простым числом
    public static boolean isPrime(int n){
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
