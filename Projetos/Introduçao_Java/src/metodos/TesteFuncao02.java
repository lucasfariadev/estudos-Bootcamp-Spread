package metodos;

public class TesteFuncao02 {
    static int soma(int a, int b){
        int s = a + b;
        return s;
    }

    public static void main(){
        System.out.print("O resultado da soma é: ");
        int resultado = soma(2,5);
        System.out.print(resultado);
    }
}
