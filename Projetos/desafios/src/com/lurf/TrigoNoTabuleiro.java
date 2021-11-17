package com.lurf;

import java.util.Scanner;

public class TrigoNoTabuleiro {

    public static void main(String[] args) {
        int gramasGraos = 12;

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=0 ; i<n ; i++) {
            int x = sc.nextInt();
            double totalTrigo = (double) Math.pow(2, x) - 1;
            double totalGramas = totalTrigo/gramasGraos;
            long totalKilos = (long) (totalGramas/ 1000);


            System.out.printf("%d kg\n", totalKilos);   //Complete o código aqui.
        }
        sc.close();

    }
        }
