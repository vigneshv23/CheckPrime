package com.apps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckPrime {

    public static void main(String[] args) throws IOException {

        String answer;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            callPrimeChecker();
            System.out.println("Do you want to try again:");
            answer = br.readLine();
        }while ("y".equalsIgnoreCase(answer)||"yes".equalsIgnoreCase(answer));

    }

    private static void callPrimeChecker() throws IOException {
        System.out.println("Enter a number to check if it is prime:");
        double number;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            number = Double.parseDouble(br.readLine());
            System.out.println(primeChecker(number));
    }

    private static boolean primeChecker(double number) {
        for(int i=2; i<=Math.floor(Math.sqrt(number)); i++)
        {
            if(primeChecker(i) && i != number && number%i == 0) {
                return false;
            }
            else {
                return true;
            }
        }
        return true;
    }
}
