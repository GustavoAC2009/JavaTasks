import java.util.Scanner;



public class ComisVendedor {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o salário fixo do vendedor: R$ ");

         double salarioFixo = leitor.nextDouble();

         System.out.print("Informe o valor total vendido no mês: R$ ");
         double totalVendas = leitor.nextDouble();
 
        double comissao = totalVendas * 0.05;
         double salarioTotal = salarioFixo + comissao;


          System.out.printf("Valor da comissão (5%%): R$ %.2f%n", comissao);

     System.out.printf("Salário final do mês: R$ %.2f%n", salarioTotal);
        
        leitor.close();
    }
}