package pooimprementstate;

public class MarioFogo implements IMarioState {
    
    
    @Override
    public IMarioState pegarCogumelo(){
        System.out.println("Mario Ganhou 1000 pontos");
        return this;
    }
        
    @Override
    public IMarioState pegarFlor(){
        System.out.println("Mario Ganhou 1000 pontos");
        return this;
        
    }
    
    @Override
    public IMarioState pegarPena(){
        System.out.println("Mario com capa");
        return new MarioCapa();
    }
        
    @Override
    public IMarioState levarDano(){
        System.out.println("Mario pequeno");
        return new MarioPequeno();
    
    }
}
