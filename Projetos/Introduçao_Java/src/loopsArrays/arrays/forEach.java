package loopsArrays.arrays;

import java.util.Arrays;

public class forEach {
    public static void main(String[] args) {
        int vetorExemplo[] = {3, 5, 4, 7, 8, 1, -3, 5,99};
        Arrays.sort(vetorExemplo);

        for (int valor : vetorExemplo) {
            System.out.print(valor + ",");
        }
    }
}
