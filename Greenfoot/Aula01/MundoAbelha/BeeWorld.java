import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * definiçao da classe BeeWorld
 * 
 * @author Ingrid Debiasio 
 * @version 205/06/04
 */
public class BeeWorld extends World
{

    /**
     * Constructor for objects of class BeeWorld.
     * 
     */
    public BeeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Aranha aranha = new Aranha();
        addObject(aranha,39,29);
        aranha.setLocation(25,31);
        aranha.setLocation(33,29);
        aranha.setLocation(30,30);
        Mosca mosca = new Mosca();
        addObject(mosca,42,332);
        mosca.setLocation(42,332);
        Abelha abelha = new Abelha();
        addObject(abelha,41,155);
        mosca.setLocation(25,315);
        mosca.setLocation(29,325);
        Mosca mosca2 = new Mosca();
        addObject(mosca2,449,90);
        Mosca mosca3 = new Mosca();
        addObject(mosca3,396,332);
        Mosca mosca4 = new Mosca();
        addObject(mosca4,107,271);
        mosca4.setLocation(92,264);
        mosca3.setLocation(96,337);
        abelha.setLocation(49,143);
        mosca4.setLocation(31,273);
        mosca.setLocation(33,378);
        mosca2.setLocation(103,266);
    }
}
