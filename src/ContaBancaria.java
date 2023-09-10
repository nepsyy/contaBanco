public class ContaBancaria {
    public static void main(String[] args) {
        int numero = Integer.valueOf(args [3]);
        String agencia = args [2];
        String nomeCliente = args [0];
        String sobrenomeCliente = args [1];
        double saldo = Double.valueOf(args [4]);

        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + 
        ", seja bem-vindo ao nosso banco. Sua agência é " + agencia + 
        ", conta " + numero + " e seu saldo " + saldo + 
        " já está disponível para saque.");
        }
    
}
