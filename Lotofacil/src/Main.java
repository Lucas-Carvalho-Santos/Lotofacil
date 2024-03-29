import java.util.Scanner;
import java.util.Random;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int aposta = 1;
        do {
            //int aposta = 1;
            System.out.println("**************************************");
            System.out.println("Menu LOTOFÁCIL");
            System.out.println("1: apostar de 0 a 100 ");
            System.out.println("2: apostar de A a Z ");
            System.out.println("3: apostar de entre PAR e IMPAR");
            System.out.println("0: SAIR");
            System.out.println("**************************************");
            Scanner sc = new Scanner(System.in);
            System.out.println("Escolha a modalidade: ");
            aposta = sc.nextInt();
            Thread.sleep(500);
            switch (aposta) {
                // caso o usuário escolha a 1° modalidade
                case 1:
                    System.out.println("Modalida escolhida: 0 a 100");
                    System.out.println("Digite um número: ");

                    Scanner s = new Scanner(System.in);
                    try {
                        int n1 = s.nextInt(); // Lendo o número escolhido pelo usuário

                        Random random = new Random();
                        int na = random.nextInt(100); // Gerando um número aleatório

                        // Testando se o número digitado e o número aleatório são iguais
                        if (n1 > 100 || n1 < 0) {
                            System.out.println("Aposta inválida");
                        } else if (n1 == na) {
                            System.out.println("Você ganhou R$ 1.000,00");
                        } else {
                            System.out.println("Que pena. O número sorteado foi " + na);
                        }
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                    }

                    Thread.sleep(500);
                    break;
                // caso o usuário escolha a 2° modalidade
                case 2:
                    System.out.println("Modalidade esoclhida: de A a Z");
                    char letraPremiada = 'L'; // Letra escolhida por você

                    System.out.println("Digite uma letra de A até Z: ");

                    try {
                        char entrada = (char) System.in.read(); // Lê um caractere do teclado

                        if (Character.isLetter(entrada)) { // Verifica se é uma letra
                            entrada = Character.toUpperCase(entrada); // Converte para maiúsculo

                            if (entrada == letraPremiada) {
                                System.out.println("Você ganhou R$ 500,00 reais.");
                            } else {
                                System.out.println("Que pena! A letra sorteada foi: " + letraPremiada + ".");
                            }
                        } else {
                            System.out.println("Aposta inválida.");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Thread.sleep(500);
                    break;
                // caso o usuário escolha a 3° modalidade
                case 3:
                    System.out.println("Modalidade escolhida: PAR ou IMPAR");
                    // lendo o número digitado
                    System.out.println("Digite um número:");
                    Scanner scn = new Scanner(System.in);
                    try {
                        int num = scn.nextInt(); // Lendo o número digitado pelo usuário

                        if (num % 2 == 0) {
                            System.out.println("Você ganhou R$ 100,00");
                        } else {
                            System.out.println("Que pena! O número digitado é ímpar e a premiação foi para os números pares!");
                        }
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                    }
                    Thread.sleep(500);
                    break;
                default:
                    if (aposta != 0) {
                        System.out.println("Opação inválida, I-M-B-E-C-I-L!!");
                    } else {
                        break;
                    }
                    Thread.sleep(500);
            }
        }while (aposta != 0) ;
    }
}