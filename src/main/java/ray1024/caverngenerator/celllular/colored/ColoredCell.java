package ray1024.caverngenerator.celllular.colored;

import ray1024.caverngenerator.celllular.Cell;

import java.awt.*;

public class ColoredCell implements Cell {

    private final Color color;

    public ColoredCell(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }
}
