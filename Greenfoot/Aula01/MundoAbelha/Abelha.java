import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * está é uma açao que representara a abelha 
 * 
 * @author Ingrid Debiasio 
 * @version 2025/06/0
 */
public class Abelha extends Actor
{
    /**
     * Act - do whatever the Abelha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(1);
        if(Greenfoot.isKeyDown("left")){
            turn(-5);
        }
        if (Greenfoot.isKeyDown("right")){
            turn(5);
        }
        verificarPosicao();
    }
    /**
     * Método verifica posicao
     */
    public void verificarPosicao(){
        if(estaNoTopo()){
            setLocation(getX(), getWorld().getHeight()-10);
        }
        if(estaNaBase()){
            setLocation(getX(), 10);
            
        }
        if(estaNaDireita()){
            setLocation(10, getY());
            
        }
        if(estaNaEsquerda()){
            setLocation(getWorld().getWidth()-10, getY());
            
        }
    }
    /**
     * método que verifica se a abelha está no topo.
     */
    public boolean estaNoTopo(){
        if(getY()<10){
            return true;
            
        } else {
            return false;
        }
    }
    /**
     * Método que verifica se a abelha está na base.
     */
    public boolean estaNaBase(){
        return getY()>getWorld().getHeight()-10;
    }
    /**
     * Método que verifica se a abelha esta a esquerda.
     */
    public boolean estaNaEsquerda(){
        return getX()<10;
    }
    /**
     * Método que verifica se a abelha está a direita.
     */
    public boolean estaNaDireita(){
        return getX()>getWorld().getWidth()-10;
    }
}

