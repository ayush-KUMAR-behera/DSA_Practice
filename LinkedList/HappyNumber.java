package LinkedList;

public class HappyNumber {
    public static void main(String[] args) {
        int a=19;
        int b=2;
        System.out.println(isHappy(a));
        System.out.println(isHappy(b));
    }

    public static int calculateSq(int n){
        int sum=0;
        while (n>0) {
            int rem=n%10;
            sum=sum+(rem*rem);
            n=n/10;
        }
        return sum;
    }

    public static boolean isHappy(int n){
        int slow=n;
        int fast=n;
        while(fast!=1){
            slow=calculateSq(slow);
            fast=calculateSq(fast);
            fast=calculateSq(fast);
            if(slow==fast&&fast!=1){
                return false;
            }
        }
        return true;
    }
    
}
