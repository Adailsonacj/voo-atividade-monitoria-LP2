package voo;

public class Voo {

    private int[] assentos = new int[100];
    private int numeroVoo;
    private String data;

    public Voo(int voo, String data){
        this.numeroVoo = voo;
        this.data = data;
    }

    public int proximoLivre(){
        int livre = 0;
        for(int i=0; i<assentos.length; i++){
            if(assentos[i] == 0){
                livre = i;
                i = 100;
            }
        }
        return livre;
    }

    public boolean verifica(int cadeira){
        boolean oculpado = false;
        if(assentos[cadeira] == 1){
            oculpado = true;
            return oculpado;
        }else{
            return oculpado;
        }
    }

    public boolean ocupa(int cadeira){
        if(verifica(cadeira)==false) {
            assentos[cadeira] = 1;
            return true;
        }
        return false;
    }

    public int vagas(){
        int vagas = 0;
        for(int i = 0; i < assentos.length; i ++){
            if(assentos[i] == 1){
                vagas =+ 1;
            }
        }
        return vagas;
    }

    public int getVoo(){
        return numeroVoo;
    }

    public String getData(){
        return data;
    }
}
