package pooimprementstate;

public class MarioGrande implements IMarioState {


    @Override
    public IMarioState pegarCogumelo(){
        System.out.println("Mario ganhou 1000 pontos");
        return this;
        
    }

    @Override
    public IMarioState pegarFlor(){
        System.out.println("Mario com fogo");
        return new MarioFogo();
    }

    @Override
    public IMarioState pegarPena() {
        System.out.println("Mario com Capa");
        return new MarioCapa();
    }

    @Override
    public IMarioState levarDano() {
        System.out.println("Mario pequeno");
        return new MarioPequeno();
    }
    
}
