import java.util.Scanner;




public class ConvMoeda {

    public static void main(String[] args) {



        Scanner leitor = new Scanner(System.in);

         System.out.print("Digite o preço do produto em Dólar (US$): ");

        double precoDolar = leitor.nextDouble();

         System.out.print("Digite a cotação atual do Real (R$): ");

        double cotacao = leitor.nextDouble();
        double precoReal = precoDolar * cotacao;

        System.out.printf("O valor equivalente em Reais é: R$ %.2f%n", precoReal);
        
        leitor.close();

    }


}