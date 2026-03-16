import java.util.Scanner;



public class TotalVenda {

    public static void main(String[] args) {

         Scanner leitor = new Scanner(System.in);

   System.out.print("Digite o preço unitário do produto: R$ ");
        double precoUnitario = leitor.nextDouble();

          System.out.print("Digite a quantidade vendida: ");
        int quantidade = leitor.nextInt();
    
      double total = precoUnitario * quantidade;

        System.out.printf("Valor total a ser pago: R$ %.2f%n", total);
        
        leitor.close();


    }


}