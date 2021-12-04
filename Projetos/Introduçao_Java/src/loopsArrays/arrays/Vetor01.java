package loopsArrays.arrays;

public class Vetor01 {
    public static void main(String[] args){
        String mes[] = {"jan", "fev", "mar", "abr", "mai", "jun", "jul",
        "ago", "set", "out", "nov", "des"};
        String tot[] = {"31", "28", "31", "30", "31", "30", "31", "31",
        "30", "31", "30", "31"};


        for (int i = 0; i< mes.length; i++){
            System.out.println("o mes de " + mes[i] +
                            " tem " + tot[i] + " dias ao todo");
        }

    }
}
