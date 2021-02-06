package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Converter {
    private static BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

    public String decimalToBinary(int n) {

        if (n == 0)
            return "0";

        String binaryNum = "";

        while (n > 0) {

            // n & 1 like n % 2
            // compare last digit of n with 1
            binaryNum = (n & 1) + binaryNum;

            // right shift 'n' by 1 bit
            // n >>= 1  like n / 2
            n >>= 1;

        }

        return binaryNum;
    }


    public void binaryToDecimal(String number) {

        System.out.println(Integer.parseInt(number, 2));
    }


    public void DecimalToOctal(int number) {
        System.out.println(Integer.toOctalString(number));
    }

    public void octalToDecimal(String number) {

        int decimal = Integer.parseInt(number, 8);
        System.out.println(decimal);
    }

    public void decimalToHexadecimal(int number) {
        System.out.println(Integer.toHexString(number));
    }

    public void hexadecimalToDecimal(String number) {

        int decimal = Integer.parseInt(number, 16);
        System.out.println(decimal);
    }

    public void binaryAdd(long number1, long number2) throws IOException {

        List<Integer> sum = new ArrayList<>();
        int i = 0, remainder = 0;

        System.out.println("1.Add");
        System.out.println("2.Subtract");
        String choice = read.readLine();

        if (choice.equals("1")) {
            while (number1 != 0 || number2 != 0) {
                sum.add(0, (int) ((number1 % 10 + number2 % 10 + remainder) % 2));
                remainder = (int) ((number1 % 10 + number2 % 10 + remainder) / 2);
                number1 = number1 / 10;
                number2 = number2 / 10;
            }
            if (remainder != 0) {
                sum.add(0, remainder);
            }

            System.out.print("result: ");
            for (Integer bin : sum) {
                System.out.print(bin);
            }
            System.out.print("\n");

        }else if (choice.equals("2")) {
            String firstBin = String.valueOf(number1);
            String secondBin = String.valueOf(number2);

            int firstBinaryNumber = Integer.parseInt(firstBin, 2);
            int secondBinaryNumber = Integer.parseInt(secondBin, 2);

            int result = firstBinaryNumber - secondBinaryNumber;

            System.out.println(firstBinaryNumber + " - "  +  secondBinaryNumber + " = " + result);
            System.out.println(number1 + " - " + number2 + " = " + Integer.toBinaryString(result));
        }
    }

    public void octalAdd(String number1, String number2) throws IOException {

        int firstOctalNumber = Integer.parseInt(number1, 8);

        int secondOctalNumber = Integer.parseInt(number2, 8);

        System.out.println("1.Add");
        System.out.println("2.Subtract");
        String choice = read.readLine();

        if (choice.equals("1")) {

            int sum = firstOctalNumber + secondOctalNumber;

            System.out.println(firstOctalNumber + " + " + secondOctalNumber + " = " + sum);
            System.out.println(number1 + " + " + number2 + " = " + Integer.toOctalString(sum));

        } else if (choice.equals("2")) {

            int sum = firstOctalNumber - secondOctalNumber;

            System.out.println(firstOctalNumber + " - " + secondOctalNumber + " = " + sum);
            System.out.println(number1 + " - " + number2 + " = " + Integer.toOctalString(sum));

        }


    }


    public  void hexadecimalAdd( String number1, String number2 ) throws IOException {

        int firstHexadecimalNumber = Integer.parseInt(number1, 16);

        int secondHexadecimalNumber = Integer.parseInt(number2, 16);

        System.out.println("1.Add");
        System.out.println("2.Subtract");

        String choice = read.readLine();

        if(choice.equals("1")){

            int sum = firstHexadecimalNumber + secondHexadecimalNumber;

            System.out.println(firstHexadecimalNumber + " + "  +  secondHexadecimalNumber + " = " + sum);
            System.out.println(number1 + " + " + number2 + " = " + Integer.toHexString(sum));

        }else if(choice.equals("2")){

            int sum = firstHexadecimalNumber - secondHexadecimalNumber;

            System.out.println(firstHexadecimalNumber + " - "  +  secondHexadecimalNumber + " = " + sum);
            System.out.println(number1 + " - " + number2 + " = " + Integer.toHexString(sum));

        }

    }

}





















































//    public   void decToBinary(int decimalNum){
//
//        List<Integer> binNum = new ArrayList<>();
//
//        while (decimalNum > 0){
//
//            binNum.add(0, decimalNum % 2 );
//            decimalNum = decimalNum / 2;
//
//        }
//
//
//        for( Integer bin : binNum){
//            System.out.print(bin);
//        }
//
//    }
//
//
//
//
//    public int binToDec(int number) {
//
//        int decimalNum = 0;
//        int degree = 0;
//
//        while (number != 0){
//            // 1 or 0
//            int lastDigit = (number & 1);
//
//            decimalNum += lastDigit * Math.pow(2, degree);
//            degree++;
//            double sqrt = Math.sqrt(10);
//            number >>= 1;
//            System.out.println(number);
////           number = number / 10;
//
//
//        }
//
//        return decimalNum;
//
//    }






