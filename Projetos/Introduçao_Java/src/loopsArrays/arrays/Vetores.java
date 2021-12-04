package loopsArrays.arrays;

import java.util.Arrays;

public class Vetores {
    public static void main(String[] args){
        //buscas em vetores

        int num[] = {3,5,7,1,8,9};
        int p = Arrays.binarySearch(num, 1);
        for(int v:num){
            System.out.print(v + " ");
        }
        System.out.println("");
        System.out.println("Encontrei o valor 1 na posição " + p);
    }
}
