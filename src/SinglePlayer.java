import java.util.Random;

public class SinglePlayer {
    private int pos = 0;

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        if(pos <= 100) this.pos = Math.max(pos, 0);
    }

    public int rollDie(){
        Random r = new Random();
        return r.nextInt(6)+1;
    }

}
