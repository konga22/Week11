package Gun.src;

import java.util.*;

public class Control extends Gun_type {

    Chator chator_1 = new Chator();
    Chator chator_2 = new Chator();

    public static void main(String[] args) {
        Control c = new Control();
        Scanner sc = new Scanner(System.in);

        c.player(1);
        c.player(2);

        c.player_moment();
    }

    void player(int i){
        Scanner sc = new Scanner(System.in);
        System.out.print("player"+i+"의 주무기를 선택하세요 ( 1 라이플 , 2 샷건 ) : ");
        int mainWeapon = sc.nextInt();
        if (mainWeapon == 1){ rifle(i-1); } else { shotgun(i-1); }

    }

    int priority(){
        double rand = Math.random();
        double rand2 = Math.random();
        int randInt1 = (int)(rand*100)+1;
        int randInt2 = (int)(rand2*100)+1;
        if(randInt1 > randInt2){ return 0; } else { return 1; }
    }

    void player_moment(){
        int number = priority();
        System.out.println("player"+(number+1)+" 가 첫번 째 순서입니다.");
        while(true){

            if(number == 0 ){
                firing(number);
                number = 1;
            }else{
                firing(number);
                number = 0;
            }

            if(chator_1.hp <= 0){
                System.out.println("player 2 승리");
                System.exit(0);
            }else if(chator_2.hp <= 0){
                System.out.println("player 1 승리");
                System.exit(0);
            }

        }
    }

    void firing(int number) {
        if (number == 0) {
            chator_1.hp = chator_1.hp - chator_1.evasion(range[0], damage[0]);
            System.out.println("player1 의 남은 hp : "+chator_1.hp);
        }else{
            chator_2.hp = chator_2.hp - chator_2.evasion(range[1], damage[1]);
            System.out.println("player2 의 남은 hp : "+chator_2.hp);
        }
    }


}
