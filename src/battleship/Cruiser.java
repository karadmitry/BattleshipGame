package battleship;

public class Cruiser extends Ship {

    public Cruiser() {
        length = 3;
        hit = new boolean[3];
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public String getShipType() {
        return "cruiser";
    }
}
