/* Projeto criacao de uma conta bancaria simples com coleta e retorno de dados mistos
* entre Strings e inteiros e variaveis*/


import java.util.Scanner;
public class Banco {
    public static void main(String[] args) {

        Scanner scanner = new Scanner ( System.in);

// ////////  Atributos Bancarios do usuario   //    /////////////////


        String nomecliente;
        String agencia;
        double saldo;
        int numero = 1021;

        agencia = "067-8";
        saldo = 237.48;
        nomecliente = "Mario Andrade";

        System.out.println( "Por favor, digite o número da Conta: ");
        String usuario = scanner.next();

        System.out.println("O numero de sua Conta e: " + numero);

        System.out.println("Ola " + nomecliente +  " Obrigado por criar uma conta em nosso Banco, sua Agência é:" + agencia +
        " O numero de sua Conta:" + numero + " Seu saldo de: £" + saldo + "  está totalmente disponível para saque");

        System.out.println("Se desejar outro servico , no momento estamos em processo de desenvolvimento;  muito obrigado ");
    }
}