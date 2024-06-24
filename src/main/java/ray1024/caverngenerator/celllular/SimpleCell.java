package ray1024.caverngenerator.celllular;

public class SimpleCell implements Cell {
    public final static SimpleCell DEAD_CELL = new SimpleCell(false);
    public final static SimpleCell ALIVE_CELL = new SimpleCell(true);

    private final boolean isAlive;

    public SimpleCell(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public boolean isAlive() {
        return isAlive;
    }
}
