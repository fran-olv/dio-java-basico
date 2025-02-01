import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        // TODO: importar classe scanner
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in);

        // exibir msgs pro usuario

        System.out.println(" Vamos criar uma conta?");

        System.out.println("Digite seu Nome");
        String nomeCliente = scanner.next();
        
        System.out.println("Digite número da Agência");
        String agencia = scanner.next();
        
        System.out.println("Digite númera da Conta");
        int conta = scanner.nextInt();

        System.out.println("Digite saldo inicial da Conta");
        double saldo = scanner.nextDouble();

    // exibir a msg da conta criada
        System.out.println("Olá,"+ nomeCliente + ", obrigado por criar uma conta em nosso banco");
        System.out.println("Sua agência é "+ agencia +", conta " +conta+ " e seu saldo "+ saldo +" já está disponível para saque");
        scanner.close();   
        }        
    }
