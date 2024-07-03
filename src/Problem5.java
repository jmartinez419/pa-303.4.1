import java.util.Scanner;

public class Problem5 {
    public static void main(String [] args){

        Scanner scan = new Scanner (System.in);
        int grade = scan.nextInt();
        if (grade >= 90 && grade <= 100){
            System.out.println("Your grade is an A");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("Your grade is a B");
        } else if (grade >= 70 && grade <= 79){
            System.out.println("Your grade is a C");
        } else if (grade >= 60 && grade <= 69){
            System.out.println("Your grade is a D");
        } else if (grade >= 0 && grade <= 59){
            System.out.println("your grade is a F");
        } else System.out.println ("Score out of range");
    }
}
