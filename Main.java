//Este é o Package (Onde toto código vai ser apresentado).
// Importando a biblioteca Scanner para permitir a leitura de dados inseridos pelo usuário.
import java.util.Scanner;
//Abaixo, temos a Classe deste código (público ou privado, etc).
// Declaração da classe "Main" que contém o código.
public class Main {
    //Abaixo, temos a organização da Classe em Métodos.
    // Método principal "main" que será executado quando o programa for iniciado.
    public static void main(String[] args) { //(String[] args) são os parâmetros que posso passar informações para o código mais tarde.

        // Criando um objeto Scanner chamado "numero1Scanner" para ler o primeiro número inserido pelo usuário.
        Scanner numero1Scanner = new Scanner(System.in);

        // Solicitando ao usuário para inserir o primeiro número e aguardando a entrada do mesmo.
        System.out.print("Digite o primeiro número: ");

        // Lendo o primeiro número digitado pelo usuário e armazenando na variável "numero1".
        double numero1 = numero1Scanner.nextDouble();

        // Criando um objeto Scanner chamado "numero2Scanner" para ler o segundo número inserido pelo usuário.
        Scanner numero2Scanner = new Scanner(System.in);

        // Solicitando ao usuário para inserir o segundo número e aguardando a entrada do mesmo.
        System.out.print("Digite o segundo número: ");

        // Lendo o segundo número digitado pelo usuário e armazenando na variável "numero2".
        double numero2 = numero2Scanner.nextDouble();

        // Realizando a soma dos dois números inseridos e armazenando o resultado na variável "resultadoSoma".
        double resultadoSoma = numero1 + numero2;

        // Imprimindo na tela o resultado da soma dos dois números inseridos pelo usuário.
        System.out.println("Resultado da soma: " + numero1 + " + " + numero2 + " = " + resultadoSoma);

        // Imprimindo na tela a mensagem "Fim do teste!" indicando o fim da execução do programa.
        System.out.println("Fim do teste!");
    }
}

