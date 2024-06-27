package ray1024.caverngenerator.celllular;

import lombok.NonNull;

import java.util.Collection;

public class SimpleCavernCellRule implements CellRule<SimpleCell> {
    @Override
    public SimpleCell apply(@NonNull Collection<SimpleCell> cells) {
        if (cells.size() != 9) throw new IllegalArgumentException("cells length must be 9, for simple 3x3 area");

        int aliveCount = (int) cells.stream().filter(SimpleCell::isAlive).count();
        return (aliveCount > 4 && aliveCount < 8) ? SimpleCell.ALIVE_CELL : SimpleCell.DEAD_CELL;
    }
}
