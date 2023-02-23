import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in);


// ////////  Atributos Bancarios do usuario   //    /////////////////


        int numero;

        double agencia;

        String nomecliente;

        Double saldo;

        String usuario;

numero = 1021;
agencia = 067.8;
nomecliente = "Mario Andrade";
saldo = 237.48;

System.out.print("Por favor digite o numero da agencia: ");





        System.out.println("Ola " + nomecliente +  " Obrigado por criar uma conta em nosso Banco, sua Agência é: " + agencia + " Conta  " + numero + " Seu saldo de " + saldo + " Já está disponível para saque");
    }
}