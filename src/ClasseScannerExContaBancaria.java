import java.util.Scanner;
import java.util.Locale;
public class ClasseScannerExContaBancaria {
    
    public static void main(String[] args) {
      
         try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("digite seu nome:");
            String nomeCliente = scanner.next();

             System.out.println("digite seu sobrenome:");
             String sobrenomeCliente = scanner.next();

             System.out.println("digite o numero da agencia:");
             int agencia = scanner.nextInt();
             
             System.out.println("digite o numero da conta:");
             int numero = scanner.nextInt();

             System.out.println("digite seu saldo:");
             int saldo = scanner.nextInt();


            System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + 
            ", seja bem-vindo ao nosso banco. Sua agência é " + agencia + 
            ", conta " + numero + " e seu saldo " + saldo + 
            " já está disponível para saque.");
        }
        }
    
}

