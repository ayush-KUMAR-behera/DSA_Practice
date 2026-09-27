package Recursion;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        System.out.println(sum(3));
        System.out.println(sum(5));
    }
    public  static  int sum(int n){
        if(n==1){
            return n;
        }else{
            return  n+sum(n-1);
        }
    }
}
