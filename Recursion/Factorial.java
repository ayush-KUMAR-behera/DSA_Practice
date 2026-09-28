package Recursion;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(factorial(6));
    }

    public static int factorial(int n){
        if(n==1){
            return  n;
        }else{
            return n*factorial(n-1);
        }
    }
}