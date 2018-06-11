
public class Main {
    public static void main (String...args){

        Voo voo = new Voo(152,  "12/05/2018");

        voo.ocupa(1);
        voo.ocupa(2);
        System.out.println(""+voo.ocupa(0) +"\n"+voo.proximoLivre()+"");



    }
}
