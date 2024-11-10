import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[]args){
        Scanner scanner =new Scanner (System.in);
        Random random = new Random(); 
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};

        System.out.println("Bem-Vindo ao Jogo Pedra, Papel e Tesoura!");

        boolean JogarNovamente = true;
        while (JogarNovamente){
            System.out.println("\nEscolha uma opção (0 = Pedra, 1 = Papel, 2= Tesoura ): ");
            int escolhaJogador = scanner.nextInt();
            int escolhaPc = random.nextInt(3);

            System.out.println("Você escolheu:" + opcoes[escolhaJogador]);
            System.out.println("Computador escolheu:" + opcoes[escolhaPc]);

            if (escolhaJogador == escolhaPc){
                System.out.println("Empate!");
            } else if ((escolhaJogador == 0 && escolhaPc == 2)||
                        (escolhaJogador == 1 && escolhaPc == 0)||
                        (escolhaJogador == 2 && escolhaPc == 1)){
                         System.out.println("Voçê Ganhou!");
                    }else {
                        System.out.println("Você perdeu!");
                
        }
        System.out.println("Deseja Jogar Novamente? (s/n): ");
        char resposta = scanner.next().charAt(0);
        JogarNovamente = (resposta == 's' || resposta == 'S');
    }
        System.out.println("Obrigado por joga!");
        scanner.close();
    }
}