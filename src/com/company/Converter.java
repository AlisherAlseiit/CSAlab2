package com.company;

import javafx.beans.binding.When;

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
            System.out.println("n:" + n);
        }

        return binaryNum;
    }

    public void binaryToDecimal(int number) {


        int decimal = 0;
        int power = 1;


        while (number > 0){
            int lastDigit = number % 10;
            number /=10;

            decimal += lastDigit * power;

            power = power * 2;
        }
        System.out.println(decimal);


    }


    public void DecimalToOctal(int number) {

        List<Integer> octal = new ArrayList<>();

        while (number != 0){

            octal.add(0, number % 8);
            number /= 8;


        }


        for (Integer num : octal) {
            System.out.print(num);
        }

        System.out.println();



    }



    public void octalToDecimal(int number) {


       int power = 1;
       int decimal = 0;

       while (number > 0){
           int lastDigit = number % 10;
           number /= 10;

           decimal += lastDigit * power;

           power = power * 8;

       }

        System.out.println(decimal);


    }






    public void decimalToHexadecimal(int number) {

        List<String> hex = new ArrayList<>();

        while (number != 0) {

            String remainder = String.valueOf(number % 16);

            switch (remainder) {
                case "10":
                    hex.add(0, "A");
                    break;
                case "11":
                    hex.add(0, "B");
                    break;

                case "12":
                    hex.add(0, "C");
                    break;

                case "13":
                    hex.add(0, "D");
                    break;

                case "14":
                    hex.add(0, "E");
                    break;

                case "15":
                    hex.add(0, "F");
                    break;
                default:
                    hex.add(0, remainder);
            }
            number /= 16;


            for (String num : hex) {
                System.out.print(num);
            }
            System.out.println();


        }
    }





    public void hexadecimalToDecimal(String number) {

        int decimal = 0;
        int power = 16;


        int num = number.length();


        for (int i = 0; i < number.length(); i++) {


            char c = number.charAt(i);

            num -= 1;



        switch (c) {
            case 'A':
                decimal += 10 * Math.pow(power, num);
                break;
            case 'B':
                decimal += 11 * Math.pow(power, num);
                break;

            case 'C':
                decimal += 12 * Math.pow(power, num);
                break;

            case 'D':
                decimal += 13 * Math.pow(power, num);
                break;

            case 'E':
                decimal += 14 * Math.pow(power, num);
                break;

            case 'F':
                decimal += 15 * Math.pow(power, num);
                break;

            default:
                String cs = String.valueOf(c);
                decimal += Integer.parseInt(cs) * Math.pow(power, num);



        }


        }
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

        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);

        List<Integer> num = new ArrayList<>();
        int i = 0, remainder = 0;

        System.out.println("1.Add");
        System.out.println("2.Subtract");
        String choice = read.readLine();

        if (choice.equals("1")) {


            while (num1 != 0 || num2 != 0){
                num.add(0, (int) ((num1 % 10 + num2 % 10 + remainder) % 8));
                remainder = (int) ((num1 % 10 + num2 % 10 + remainder) / 8);
                num1 /= 10;
                num2 /= 10;
            }

            if (remainder != 0) {
                num.add(0, remainder);
            }

            System.out.print("result: ");
            for (Integer bin : num) {
                System.out.print(bin);
            }
            System.out.print("\n");


        } else if (choice.equals("2")) {


            int firstOctalNumber = Integer.parseInt(number1, 8);

            int secondOctalNumber = Integer.parseInt(number2, 8);

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

























































