package rzutkosciagra;

import java.util.Random;

public class PlayerComp extends Player {
    
    public PlayerComp(){
        
    }
    
    public PlayerComp(String name){
        super(name);
    }
    String name;
    
    
    @Override
     public int guess(){
        Random random = new Random();
        return random.nextInt(6)+1; 
     }
     
    
    
}

//singleton
