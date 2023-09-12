/**
 * <b>Note:</b> Leia atentamente a documento desta classe
 * para desfrutar dos recursos oferecidos pelo autor.
 * 
 * 
 * O projeto é um pequeno Caixa Eletrônico que vai calcular o seu saldo.
 * Tem como objetivo exercitar a prática da Linguagem Java e sua sintaxe,
 * além do uso do método Scanner que busca maior interatividade com o usuário.
 * 
 * Variavéis:
 * saldoDaConta --> Irá pedir para o usuário digitar qual seu saldo.
 * valorDepositado --> Irá pedir para o usuário digitar um valor a ser depositado.
 * valorRetirado --> Irá pedir para o usuário digitar um valor a ser retirado da conta.
 * 
 * Por fim, o uso da sintaxe para o calculo do saldo final do usuário. 
 *
 * CaixaEletronico
 * 
 * 
 * @author Bruno Rodrigues Peixoto
 * @since 12/09/2023
 * @version 1.0
 */
import java.util.Scanner;
import java.util.Locale;

public class CaixaEletronico {

    public static void main(String[] args) {
        
        Scanner entradaDeDados = new Scanner(System.in);

        System.out.println("Saldo da conta: ");
        int saldoDaConta = entradaDeDados.nextInt();

        System.out.println("Depósito: ");
        int valorDepositado = entradaDeDados.nextInt();

        System.out.println("Retirada: ");
        int valorRetirado = entradaDeDados.nextInt();

        saldoDaConta = saldoDaConta + valorDepositado;
        saldoDaConta = saldoDaConta - valorRetirado;

        System.out.println("O saldo atual da conta é de R$"+ saldoDaConta);


    }
}