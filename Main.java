import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String args[]) {
        
        // 1) Resposta: O valor da variável SOMA será 91. Segue abaixo um exemplo de código que faz o proposto pelo exercício:
        int indice = 13, soma = 0, k = 0;
        while(k < indice) {
            k = k + 1;
            soma = soma + k;
        }
        System.out.println("O valor da variavel soma e: "+soma);

        

        // 2) Segue o código
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        String input = "";

        System.out.println("Digite um numero: ");

        try {
            input = br.readLine();
        } catch(IOException e) {
            System.out.println("Erro!");
            System.exit(0);
        }

        int fibo1 = 0, fibo2 = 1, prox = 0;
        int numero = Integer.parseInt(input);

        while(true) {
            if(numero < fibo1) {
                System.out.println("O numero "+numero+" NAO ESTA na sequencia de Fibonacci :(");
                break;
            } else if(numero == fibo1 || numero == fibo2) {
                System.out.println("O numero "+numero+" ESTA na sequencia de Fibonacci!");
                break;
            } else {
                prox = fibo1 + fibo2;
                fibo1 = fibo2;
                fibo2 = prox;
            }
        }



        // 5) Segue o código:
        input = "";
        String inverted = "";

        System.out.println("Digite o que quiser: ");

        try {
            input = br.readLine();
        } catch(IOException e) {
            System.out.println("Erro!");
            System.exit(0);
        }

        int len = input.length();
        char[] input_array = input.toCharArray();

        for(int i = len-1; i >= 0; i--) {
            inverted += input_array[i];
        }

        System.out.println(input+" invertido fica: "+inverted);
    }

} 
