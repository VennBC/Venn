# Venn
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)



public class Space extends World{
    public Score score_field;

    public Space(){    
        super(600, 400, 1);
        Color black = new Color(0,0,0);
        GreenfootImage background = getBackground();
        background.setColor(black);
        background.fill();             
        
        Score score_field = new Score("Score: 0");
        addObject(score_field, 80, 40);
        
        addObject(new Enemy(score_field), getWidth() + 1 , Greenfoot.getRandomNumber(400));
        
        Ship ship = new Ship();        
        addObject(ship, 100, 200);
        
        createStars(50);
        
        setPaintOrder(Ship.class, Laser.class, Enemy.class, Stars.class);
       
  }
    
    private void createStars(int number)
    {   
    
      for(int i = 0; i < number; i++)
      {
      int x = Greenfoot.getRandomNumber( getWidth() );   
      int y = Greenfoot.getRandomNumber( getHeight() );
      addObject(new Stars(), x, y);
      }
   
    }
}
