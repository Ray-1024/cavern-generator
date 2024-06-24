package ray1024.caverngenerator;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class SimpleCell implements Cell {
    public final static SimpleCell DEAD_CELL = new SimpleCell(false);
    public final static SimpleCell ALIVE_CELL = new SimpleCell(true);

    private boolean isAlive;
}
