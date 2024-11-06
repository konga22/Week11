public class FPS_GAME {
    public static void main(String[] args) {
     Gun ak47 = new AK47();
     Gun shotgun = new Shotgun();
     Gun trg21 = new TRG21();
     Gun minigun = new Minigun();

     ak47.fire();
     ak47.reload(30);
     ak47.reload();
     ak47.pickUp();

     shotgun.fire();
     shotgun.reload(8);
     shotgun.pickUp();

     trg21.fire();
     trg21.reload(4);
     trg21.pickUp();

     minigun.fire();
     minigun.reload(100);
     minigun.pickUp();
    }
}
class Gun {
    void fire(){
    }
    void reload(){
    }
    void reload(int a){
    }
    void pickUp(){
    }
}
class AK47 extends Gun{
    void pickUp(){
        System.out.println("Ak47 pick up");
    }
    @Override
   void reload(int a){
       System.out.println(a+"발 5.56mm 장전");
   }
    void fire() {
        System.out.println("총알 전부 발사");
    }
}

class Shotgun extends AK47{
    void pickUp(){
        System.out.println("Shotgun pick up");
    }
    @Override
    void reload(int a){
        System.out.println(a+"발 12게이지 산탄 장전");
    }
}
class TRG21 extends Shotgun{
    void pickUp(){
        System.out.println("TRG21 pick up");
    }
    @Override
    void reload(int a){
        System.out.println(a+"발 7탄 장전");
    }
}
class Minigun extends Shotgun{
    @Override
    void pickUp(){
        System.out.println("미니건을 거치합니다");
    }
    void reload(int a){
        System.out.println(a+"발 5.56mm 장전");
    }
    void fire(){
        System.out.println("총알 전부 발사");
    }
}