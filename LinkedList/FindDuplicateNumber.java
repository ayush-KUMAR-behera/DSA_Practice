package LinkedList;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] a={1,2,3,4,2};
        System.out.println(findDuplicate(a));
    }
    public static int findDuplicate(int[] a){
        int slow=0;
        int fast=0;
        while (true) {
            slow=a[slow];
            fast=a[fast];
            fast=a[fast];
            if(slow==fast){
                slow=0;
                while(slow!=fast){
                    slow=a[slow];
                    fast=a[fast];
                }
                return slow;
            }
        }
    }
}
