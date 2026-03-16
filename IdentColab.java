import java.util.Scanner;




public class IdentColab {
 public static void main(String[] args) {

 
        Scanner leitor = new Scanner(System.in);

         System.out.print("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.print("Digite seu cargo: ");
        String cargo = leitor.nextLine();
        System.out.println("Bem-vindo ao Sistema Comercial, " + nome + ". Seu acesso como " + cargo + " foi configurado com sucesso.");
    
    }

}