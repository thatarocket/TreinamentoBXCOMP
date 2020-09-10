import java.util.Scanner;

public class Desafio{

    public static void main(String[] args){

        Scanner nEntradas = new Scanner(System.in);

        System.out.println("Insira o numero de entradas:");

        int numero = Integer.parseInt(nEntradas.next());

        int i = 0;

        while(i < numero){
            Scanner entradas = new Scanner(System.in);

            System.out.println("Insira a mensagem:");

            String mensagem = entradas.nextLine();

            char[] mensagemInvertida = mensagem.toCharArray();

            System.out.println("Esta eh a msg traduzida:");

            for(int j = mensagemInvertida.length-1; j >= 0; j--){
                System.out.print(mensagemInvertida[j]);
            }
            
            System.out.println("\n");

            i++;
        }

    }

}