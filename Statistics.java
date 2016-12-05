package rzutkosciagra;

import java.util.HashMap;
import java.util.Map;

public class Statistics {

    private Map<Player,Integer> stats = new HashMap();

    public void addPlayer(Player player){
        stats.put(player, 0);
    }
    
    public void winner(Player player) {
       
    stats.put(player,stats.get(player)+1);
            }
    

    
    public void display(){
        
       for (Map.Entry<Player,Integer> s: stats.entrySet()){
           System.out.println(s.getKey().getName() + " :" + s.getValue());  
           
       } 
       
    }

    
}
