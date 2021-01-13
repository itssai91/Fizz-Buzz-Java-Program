import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){
        System.out.println("'''Welcome To FizzBuzz Program'''");
        Scanner sc = new Scanner(System.in); // Scanner Object Created
        System.out.print("Please Enter a Starting Number: ");
        int num1 = sc.nextInt(); //First User Input Stored in a Variable
        System.out.print("Please Enter Your Second  Number: ");
        int num2 = sc.nextInt(); // Second USer Input Stored in a Variable
        fizzbuzz(num1, num2); // FizzBuzz Function Calling
    }

    //FizzBuzz Logic Integrate With FizzBuzz Method
    public static void fizzbuzz(int start, int end){
        int i;
        for(i=start; i<end; i++ ){
            if ((i%3 == 0) && (i%5==0)){
                System.out.println("FizzBuzz");
            }else if(i%3 == 0){
                System.out.println("Fizz");
            }else if(i%5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
