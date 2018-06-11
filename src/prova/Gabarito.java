package prova;

public class Gabarito {
    //Define uma lista de questões
    char[] quest = new char[15];

    public void atribuiRespostas(int questao, char resposta){
        quest[questao] = resposta;
    }

    public char respostaQuestao(int numeroQuestao){
        return quest[numeroQuestao];
    }
}
