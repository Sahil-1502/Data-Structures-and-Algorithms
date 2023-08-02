import java.util.*;
public class number_palindrome {

    public static void isPalindrome(int n){
        int rev = 0;
        int original_num=n;
        for(int i=0;n>0;i++){
            int last_digit = n%10;
            rev = rev*10 + last_digit;
            n= n/10;
        }
        System.out.println(rev);

        if(rev==original_num){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isPalindrome(n);
        
    }
}

// import java.util.Scanner;

// public class number_palindrome {
//    public static void main(String[] args) {
//       Scanner input = new Scanner(System.in);
//       System.out.print("Enter a number: ");
//       int num = input.nextInt();
//       int originalNum = num;
//       int reversedNum = 0;
//       while (num != 0) {
//          int lastDigit = num % 10;
//          reversedNum = reversedNum * 10 + lastDigit;
//          num /= 10;
//       }
//       if (originalNum == reversedNum) {
//          System.out.println(originalNum + " is a palindrome");
//       } else {
//          System.out.println(originalNum + " is not a palindrome");
//       }
//    }
// }
