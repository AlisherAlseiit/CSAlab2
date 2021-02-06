package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

    private static Boolean exit = true;

    public static void main(String[] args) throws IOException {

        Converter converter = new Converter();

        while (exit) {
        System.out.println("1. Dec to Bin");
        System.out.println("2. Bin to Dec");
        System.out.println("3. Decimal to Octal");
        System.out.println("4. Octal to Decimal");
        System.out.println("5. Decimal to Hexadecimal");
        System.out.println("6. Hex to Dec");
        System.out.println("7. binary Arithmetic operations");
        System.out.println("8. octal Arithmetic operations");
        System.out.println("9. hexadecimal Arithmetic operations");
        System.out.println("0. to Exit");


        String choice = read.readLine();

            switch (choice){
                case "1":
                System.out.println("Enter Decimal number");
                int decNum = Integer.parseInt(read.readLine());
//                converter.decToBinary(decNum);
                    System.out.println(converter.decimalToBinary(decNum));
                    break;
                case "2":
                    System.out.println("Enter Binary number");
//                    int binNum = Integer.parseInt(read.readLine());
                    String binNum =(read.readLine());
                    converter.binaryToDecimal(binNum);
                break;
                case "3":
                    System.out.println("Enter Decimal number");
                    int decnumber = Integer.parseInt(read.readLine());
                    converter.DecimalToOctal(decnumber);
                    break;
                case "4":
                    System.out.println("Enter Octal number");
                    String octalNumber = read.readLine();
                    converter.octalToDecimal(octalNumber);
                    break;
                case "5":
                    System.out.println("Enter Hexadecimal number");
                    int decimalNum = Integer.parseInt(read.readLine());
                    converter.decimalToHexadecimal(decimalNum);
                    break;
                case "6":
                    System.out.println("Enter HexaDecimal number");
                    String hexNum = read.readLine();
                    converter.hexadecimalToDecimal(hexNum);
                    break;
                case "7":
                    System.out.println("Enter binary number");
                    long binNum1 = Long.parseLong(read.readLine());
                    System.out.println("Enter second binary number");
                    long binNum2 = Long.parseLong(read.readLine());

                    converter.binaryAdd(binNum1, binNum2);
                    break;
                case "8":
                    System.out.println("Enter octal number");
                    String octalNum1 = read.readLine();
                    System.out.println("Enter second  octal  number");
                    String octalNum2 = read.readLine();

                    converter.octalAdd(octalNum1, octalNum2);
                    break;
                case "9":
                    System.out.println("Enter hexadecimal number");
                    String hexNumber1 = read.readLine();
                    System.out.println("Enter second hexadecimal number");
                    String hexNumber2 = read.readLine();

                    converter.hexadecimalAdd(hexNumber1, hexNumber2);
                    break;
                case "0":
                    exit = false;
            }
        }




    }

}
