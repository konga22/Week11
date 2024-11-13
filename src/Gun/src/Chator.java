package Gun.src;

import java.util.*;


public class Chator {
    int hp = 100;

    int evasion(int range, int damage){
        double rand = Math.random();
        int randInt = (int)(rand*100)+1;
        if(randInt >= range){
            System.out.println("회피 성공");
            return 0;
        }
        return damage;
    }

}
