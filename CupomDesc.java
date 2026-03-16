import java.util.Scanner;

 

     
public class CupomDesc { 

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

 
        System.out.print("Digite o valor original da compra: R$ ");
 
         double valorOriginal = leitor.nextDouble();

        double valorDesconto = valorOriginal * 0.15;
        double valorFinal = valorOriginal - valorDesconto;
  

                                                  //porcentagem e ponto com algum número após ele é para casas decimais
        System.out.printf("Desconto aplicado (15%%): R$ %.2f%n", valorDesconto);
        System.out.printf("Total a pagar: R$ %.2f%n", valorFinal);

        
        leitor.close(); 


 
    }
}

