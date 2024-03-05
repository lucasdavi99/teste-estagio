import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Questão 1
        System.out.println("Questão 1");

        int indice = 13;
        int soma = 0;
        int k = 0;

        while (k < indice) {
            k += 1;
            soma += k;
        }
        System.out.println("valor total: " + soma);

        // Questão 2
        System.out.println();
        System.out.println("Questão 2");


        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        scanner.nextLine();

        if (verificarFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }

        //Questão 3

        System.out.println();
        System.out.println("Questão 3");

        // Sequência a)
        int proximoA = proximoElementoSequenciaA(7);
        System.out.println("Próximo elemento da sequência a): " + proximoA);

        // Sequência b)
        int proximoB = proximoElementoSequenciaB(64);
        System.out.println("Próximo elemento da sequência b): " + proximoB);

        // Sequência c)
        int proximoC = proximoElementoSequenciaC(36);
        System.out.println("Próximo elemento da sequência c): " + proximoC);

        // Sequência d)
        int proximoD = proximoElementoSequenciaD(64);
        System.out.println("Próximo elemento da sequência d): " + proximoD);

        // Sequência e)
        int proximoE = proximoElementoSequenciaE(8);
        System.out.println("Próximo elemento da sequência e): " + proximoE);

        // Sequência f)
        int proximoF = proximoElementoSequenciaF(19);
        System.out.println("Próximo elemento da sequência f): " + proximoF);

        //Questão 4
        System.out.println();
        System.out.println("Questão 4");

        // Simulando o estado inicial das lâmpadas (desligadas e frias)
        boolean[] lampadas = {false, false, false};

        // Ligando o primeiro interruptor
        ligarInterruptor(0, lampadas);

        // Desligando o primeiro e ligando o segundo interruptor
        desligarInterruptor(0, lampadas);
        ligarInterruptor(1, lampadas);

        // Verificando o estado das lâmpadas
        for (int i = 0; i < lampadas.length; i++) {
            if (lampadas[i]) {
                System.out.println("O interruptor " + (i + 1) + " controla a lâmpada " + (i + 1));
            } else {
                System.out.println("O interruptor " + (i + 1) + " não controla a lâmpada " + (i + 1));
            }
        }

        //Questão 5
        System.out.println();
        System.out.println("Questão 5");

        System.out.print("Digite uma string para inverter: ");
        String entrada = scanner.nextLine();

        String invertida = inverterString(entrada);

        System.out.println("String invertida: " + invertida);

        scanner.close();
    }

    /////// Complemento da questão 2 ///////
    public static boolean verificarFibonacci(int num) {
        int primeiro = 0;
        int segundo = 1;

        while (primeiro <= num) {
            if (primeiro == num) {
                return true;
            }
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        return false;
    }

    /////// Complemento da questão 3 ///////
    public static int proximoElementoSequenciaA(int num) {
        return num + 2;
    }

    public static int proximoElementoSequenciaB(int num) {
        return num * 2;
    }

    public static int proximoElementoSequenciaC(int num) {
        int raiz = (int) Math.sqrt(num);
        return (raiz + 1) * (raiz + 1);
    }

    public static int proximoElementoSequenciaD(int num) {
        int raiz = (int) Math.sqrt(num);
        return (raiz + 1) * (raiz + 1);
    }

    public static int proximoElementoSequenciaE(int num) {
        int primeiro = 0;
        int segundo = 1;
        int proximo = primeiro + segundo;

        while (proximo <= num) {
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        return proximo;
    }

    public static int proximoElementoSequenciaF(int num) {
        return num + 1;
    }

    /////// Complemento da questão 4 ///////
    public static void ligarInterruptor(int interruptor, boolean[] lampadas) {
        lampadas[interruptor] = !lampadas[interruptor];
    }

    public static void desligarInterruptor(int interruptor, boolean[] lampadas) {
        lampadas[interruptor] = !lampadas[interruptor];
    }

    /////// Complemento da questão 5 ///////
    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;

        while (inicio < fim) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;

            inicio++;
            fim--;
        }

        return new String(caracteres);
    }
}