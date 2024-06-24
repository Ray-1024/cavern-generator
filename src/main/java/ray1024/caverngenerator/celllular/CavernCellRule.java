package ray1024.caverngenerator.celllular;

import java.util.Arrays;
import java.util.Objects;

public class CavernCellRule implements CellRule<SimpleCell> {
    @Override
    public SimpleCell apply(SimpleCell[] cells) {
        if (Objects.isNull(cells)) throw new IllegalArgumentException("cells is null");
        if (cells.length != 8) throw new IllegalArgumentException("cells length must be 8");

        int aliveCount = (int) Arrays.stream(cells).filter(SimpleCell::isAlive).count();
        return (aliveCount > 4 && aliveCount < 8) ? SimpleCell.ALIVE_CELL : SimpleCell.DEAD_CELL;
    }
}
