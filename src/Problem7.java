import java.util.Scanner;

public class Problem7 {
    public static void main(String [] args){

        String Single = "Single";
        String Mfj = "Mfj";
        String Mfs = "Mfs";
        String Hoh = "Hoh";

        Scanner scan = new Scanner(System.in);
        String filingStatus = scan.next();
        int ytd = scan.nextInt();

        if(ytd >= 0 && ytd <= 8350 && filingStatus.equals(Single) || filingStatus.equals(Mfs) || ytd >= 0 && ytd <= 16700 && filingStatus.equals(Mfj) || ytd >= 0 && ytd <= 11950 && filingStatus.equals(Hoh)){
            System.out.println("You owe: " + (ytd * 0.10));
        }else if(ytd >= 8351 && ytd <= 33950 && filingStatus.equals(Single) || filingStatus.equals(Mfs) || ytd >= 16701 && ytd <= 67900 && filingStatus.equals(Mfj) || ytd >= 11951 && ytd <= 45500 && filingStatus.equals(Hoh)) {
            System.out.println("You owe:" + (ytd * 0.15));
        }else if(ytd >= 33951 && ytd <= 82250 && filingStatus.equals(Single) || filingStatus.equals(Mfs) || ytd >= 67901 && ytd <= 137050 && filingStatus.equals(Mfj) || ytd >= 45501 && ytd <= 117450 && filingStatus.equals(Hoh)) {
            System.out.println("You owe:" + (ytd * 0.25));
        }else if (ytd >= 82251 && ytd <= 171550 && filingStatus.equals(Single) || filingStatus.equals(Mfs) || ytd >= 137051 && ytd <= 208850 && filingStatus.equals(Mfj) || ytd >= 117451 && ytd <= 190200 && filingStatus.equals(Hoh)) {
            System.out.println("You owe:" + (ytd * 0.28));
        }else if (ytd >= 171551 && ytd <= 372950 && filingStatus.equals(Single) || filingStatus.equals(Mfs) || ytd >= 208851 && ytd <= 372950 && filingStatus.equals(Mfj) || ytd >= 190200 && ytd <= 372950 && filingStatus.equals(Hoh)) {
            System.out.println("You owe:" + (ytd * 0.33));
        }else if (ytd > 372951 && filingStatus.equals(Single) || filingStatus.equals(Hoh) || filingStatus.equals(Mfj) || ytd > 186476 && filingStatus.equals(Mfs)) {
            System.out.println("You owe:" + (ytd * 0.35));
        }else System.out.print("Not valid input");

                    };
                };



