import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Aqui é a classe mosca.
 * 
 * @author Ingrid Debiasio
 * @version 2025-06-03
 */
public class Mosca extends Inseto
{
    /**
     * Act - método responsável pelas ações da mosca voando quando 
     * os botões Act ou Run são pressionados.
     */
    public void act()
    {
        // Add your action code here.
        move(1);
       if(Greenfoot.getRandomNumber(100)<20){
           turn(45-Greenfoot.getRandomNumber(90));           
       }
       verificarCanto();
    }
}
