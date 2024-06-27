package ray1024.caverngenerator.celllular;

import java.util.ArrayList;
import java.util.Random;

public class SimpleCellularAutomaton implements CellularAutomaton<SimpleCell> {
    private final int width;
    private final int height;
    private final SimpleCell[] field;
    private final SimpleCavernCellRule rule;

    public SimpleCellularAutomaton(int width, int height) {
        this.width = width;
        this.height = height;
        field = new SimpleCell[width * height];
        final Random random = new Random();
        for (int i = 0; i < field.length; i++) {
            field[i] = random.nextBoolean() ? SimpleCell.ALIVE_CELL : SimpleCell.DEAD_CELL;
        }
        rule = new SimpleCavernCellRule();
    }

    private void fillNeighbours(int cellIndex, ArrayList<SimpleCell> neighbours) {
        neighbours.set(0, cellIndex - width - 1 >= 0 ? field[cellIndex - width - 1] : SimpleCell.DEAD_CELL);
        neighbours.set(1, cellIndex - width >= 0 ? field[cellIndex - width] : SimpleCell.DEAD_CELL);
        neighbours.set(2, cellIndex - width + 1 >= 0 ? field[cellIndex - width + 1] : SimpleCell.DEAD_CELL);

        neighbours.set(3, cellIndex - 1 >= 0 ? field[cellIndex - 1] : SimpleCell.DEAD_CELL);
        neighbours.set(4, cellIndex + 1 < field.length ? field[cellIndex + 1] : SimpleCell.DEAD_CELL);

        neighbours.set(5, cellIndex + width - 1 < field.length ? field[cellIndex + width - 1] : SimpleCell.DEAD_CELL);
        neighbours.set(6, cellIndex + width < field.length ? field[cellIndex + width] : SimpleCell.DEAD_CELL);
        neighbours.set(7, cellIndex + width + 1 < field.length ? field[cellIndex + width + 1] : SimpleCell.DEAD_CELL);
    }

    @Override
    public void refresh() {
        final ArrayList<SimpleCell> neighbors = new ArrayList<>();
        for (int i = 0; i < field.length; i++) {
            fillNeighbours(i, neighbors);
            field[i] = rule.apply(neighbors);
        }
    }
}
