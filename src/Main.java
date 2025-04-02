import batista.gomes.welinton.Logar.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        new ContaCorrente();
        float contaCorrente = 30000.00f;
        new ContaInvestimento();
        float saldoContaInvestimento = 50000.00f;
        new CryptoMoeda();
        float crypto = 1800000.f;

        Scanner sc = new Scanner(System.in);

        Login Login = new Login();
        Cadastra cadastra = new Cadastra();



        int op;

        do {
            System.out.println("\n-1 Login: \n-2 Cadastrar: \n-3 Ver saldo em Conta corrente: \n-4 Ver saldo em conta de Investimento: \n-5 Crypto moedas ");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Username");
                    String username = sc.next() + sc.nextLine();
                    System.out.println("Password");
                    String password = sc.next()+ sc.nextLine();
                    break;
                case 2:
                    System.out.println("nome completo:");
                    String nomeCompleto = sc.next() + sc.nextLine();
                    System.out.println("Cpf");
                    String cpf = sc.next() + sc.nextLine();
                    System.out.println(" Estado:");
                    String estado = sc.next() + sc.nextLine();
                    System.out.println(" cidade:");
                    String dataNasc = sc.next() + sc.nextLine();
                    System.out.println(" Data de nascimento:");
                    String cep = sc.next() + sc.nextLine();
                    System.out.println(" Cep:");

                    break;
                case 3:
                    System.out.println("Seu Saldo na Conta é : " + contaCorrente  );
                    break;
                case 4:
                    System.out.println("Saldo conta Investimento : " + saldoContaInvestimento  );
                    break;
                case 5:
                    System.out.println("Minhas Cryptos : " + crypto  );
                    break;
                case 0:
                    System.out.println("FINALIZAR PROGRAMA:");
                    break;

                    default:
                    System.out.println("Opção invalida:");


            }



        } while (op != 0) ;

        sc.close();
    }
}