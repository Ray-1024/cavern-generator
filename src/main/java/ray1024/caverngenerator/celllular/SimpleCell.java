package ray1024.caverngenerator.celllular;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class SimpleCell implements Cell {
    public final static SimpleCell DEAD_CELL = new SimpleCell(false);
    public final static SimpleCell ALIVE_CELL = new SimpleCell(true);

    private final boolean isAlive;
}
