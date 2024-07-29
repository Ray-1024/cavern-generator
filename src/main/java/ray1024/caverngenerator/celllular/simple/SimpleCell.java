package ray1024.caverngenerator.celllular.simple;

import ray1024.caverngenerator.celllular.Cell;

import java.awt.*;

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

    @Override
    public Color getColor() {
        return isAlive ? Color.WHITE : Color.BLACK;
    }
}
