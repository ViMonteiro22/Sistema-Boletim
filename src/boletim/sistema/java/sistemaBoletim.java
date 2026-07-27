package boletim.sistema.java;

public class sistemaBoletim {
    public static void main(String[] args) {
        //  Objetivo: Criar um programa que calcula a média de um aluno
        //  e diz se ele atingiu a nota mínima para passar de ano.

        String nome = "Victória";
        double  notaDaProva01 = 10.0;
        double  notaDaProva02 = 7.0;
        double  notaDaProva03 = 5.5;
        double media = (notaDaProva01 + notaDaProva02 + notaDaProva03) / 3;
        boolean isAprovado = media >= 7.0;
        String resultado = "A aluna " + nome + " tirou as notas " + notaDaProva01 + ", " + notaDaProva02 + " e "
                + notaDaProva03 + ". A média final foi de: " + media + ". A aluna foi aprovada? " + isAprovado;
        System.out.println(resultado);

    }
}