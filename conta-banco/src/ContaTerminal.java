import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Olá, por favor digite o seu nome");
        String nome = scanner.next();

        System.out.println("Bem vindo " + nome + " Digite o numero da Agencia");
        int agencia = scanner.nextInt();
        
        System.out.println("Certo... Agora digite o numero da conta");
        int numeroConta = scanner.nextInt();
        

        System.out.println("Ótimo. Por fim, digite o valor do seu deposito inicial");
        Double saldo = scanner.nextDouble();

    
        //TODO: exibir a mensagem final
        System.out.println("Olá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numeroConta +" e seu saldo " + saldo +" já está disponível para saque!");
    }
}
