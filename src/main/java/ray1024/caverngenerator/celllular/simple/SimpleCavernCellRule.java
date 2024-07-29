package ray1024.caverngenerator.celllular.simple;

import ray1024.caverngenerator.celllular.CellRule;

import java.util.Collection;
import java.util.Objects;

public class SimpleCavernCellRule implements CellRule<SimpleCell> {
    @Override
    public SimpleCell apply(Collection<SimpleCell> cells) {
        if (Objects.isNull(cells)) throw new IllegalArgumentException("cells can't be null");
        if (cells.size() != 9) throw new IllegalArgumentException("cells length must be 9, for simple 3x3 area");

        int aliveCount = (int) cells.stream().filter(SimpleCell::isAlive).count();
        return (aliveCount > 4 && aliveCount < 8) ? SimpleCell.ALIVE_CELL : SimpleCell.DEAD_CELL;
    }
}
