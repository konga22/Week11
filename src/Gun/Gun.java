package Gun;

public class Gun {
    int[] range = new int[2];
    int[] magazineCount = new int[2];
    int[] damage = new int[2];

    void valueChange(int i,int range, int magazineCount, int damage) {
        this.range[i] = range;
        this.magazineCount[i] = magazineCount;
        this.damage[i] = damage;
    }

    void valueChane(int i){
        this.range[i] = 100;
        this.magazineCount[i] = 100;
        this.damage[i] = 100;
    }
}
