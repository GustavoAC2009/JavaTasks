
import java.util.Scanner;



public class CalcPreco {

    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o preço de custo do produto: R$ ");
     double precoCusto = leitor.nextDouble();

       
        double precoFinal = precoCusto * 1.25;

        System.out.printf("O preço final de venda é: R$ %.2f%n", precoFinal);
        

        
        leitor.close();


    }
}