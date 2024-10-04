package pooimprementstate;

public class MarioPequeno implements IMarioState  {
    
    
    @Override
    public IMarioState pegarCogumelo(){
        System.out.println("Mario Grande");
        return new MarioGrande();
    }
    
    
    @Override
    public IMarioState pegarFlor(){
        System.out.println("Mario com Fogo");
        return new MarioFogo();
    }
    
    @Override
    public IMarioState pegarPena(){
        System.out.println("Mario com capa");
        return new MarioCapa();
    }
    
    
    @Override
    public IMarioState levarDano(){
        System.out.println("Mario pequeno");
        return this;
    }
    
}
