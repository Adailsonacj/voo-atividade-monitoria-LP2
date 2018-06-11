package prova;

public class Prova {

    private Gabarito gabarito;
    private char[] questoes = new char[15];
    private int contadorQuestoes = 0;

    public Prova(Gabarito gabarito){
        this.gabarito = gabarito;
    }

    public void clone(Prova prova){
        Prova provaClone = prova;
    }

    public void respostaAluno(char resposta){
            questoes[contadorQuestoes] = resposta;
            contadorQuestoes =+ 1;
    }

    public int acertos (){
        int numeroAcertor = 0;
        for(int i= 0; i>questoes.length; i++){
            if(gabarito.respostaQuestao(i) == questoes[i]){
                numeroAcertor =+1;
            }
        }
        return numeroAcertor;
    }
}
