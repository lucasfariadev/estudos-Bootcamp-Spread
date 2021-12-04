package loopsArrays.loops;
import javax.swing.JOptionPane;

public class Repeticao {
    public static void main(String[] args) {
        int n = 0;
        int somaValores = 0;
        int totalValores = 0;
        int totalPares = 0;
        int totalImpares = 0;
        int maior100 = 0;
        int media = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um número: <br><em>(valor 0 interompe)</em></html>"));
            totalValores += 1;
            somaValores += n;
            if (n%2 == 0){
                totalPares += 1;
            }else{
                totalImpares +=1;
            }
            if (n > 100){
                maior100 += 1;
            }

        } while (n != 0);
        media = somaValores/totalValores;
        JOptionPane.showMessageDialog(null,
                "<html>Resultado <hr>" +
                "<br>Total de Valores: " +  totalValores +
                "<br>Total de Pares: " + totalPares +
                "<br>Total de Ímpares: " + totalImpares +
                "<br> Acima de 100: " + maior100 +
                "<br> Média dos valores: " + media + "</html>");
    }

}
