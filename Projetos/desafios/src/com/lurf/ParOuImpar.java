package com.lurf;
import java.io.IOException;
import java.util.Scanner;

public class ParOuImpar {
        public static void main(String[] args) throws IOException {
            Scanner leitor = new Scanner(System.in);
            String sinal = " ";
            String oddEven = " ";
            int N = leitor.nextInt();
            for (int i = 0; i < N; i++) {
                int number = leitor.nextInt();
                if (number != 0){

                    if (number < 0){
                        sinal = "NEGATIVE";
                    }
                    if (number > 0){
                        sinal = "POSITIVE";
                    }

                    if (number % 2 == 0){
                        oddEven = "EVEN";
                    }

                    if (number % 2 != 0){
                        oddEven = "ODD";
                    }

                    System.out.println(oddEven + " " + sinal);
                }
                else{
                    System.out.println("NULL");
                }

            }
        }

    }

