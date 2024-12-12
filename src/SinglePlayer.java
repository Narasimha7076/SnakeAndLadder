import java.util.Random;

public class SinglePlayer {
    private int pos = 0;

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int rollDie(){
        Random r = new Random();
        return r.nextInt(6)+1;
    }

}
