package principal;

import dados.JogadorDeFutebol;
import dados.SessaoDeTreinamento;

public class Main {

    public static void main(String[] args) {
	// criar dois jogadores de futebol
        JogadorDeFutebol Messi = new JogadorDeFutebol();
        JogadorDeFutebol Edmundo = new JogadorDeFutebol();

    // configurando os atributos
        Messi.setNome("Messi");
        Messi.setEnergia(100);

        Edmundo.setNome("Edmundo");
        Edmundo.setEnergia(100);

        SessaoDeTreinamento treino = new SessaoDeTreinamento();

        System.out.println(Messi.getNome());
        treino.treinar(Messi);

        System.out.println(Edmundo.getNome());
        treino.treinar(Edmundo);

    }
}
