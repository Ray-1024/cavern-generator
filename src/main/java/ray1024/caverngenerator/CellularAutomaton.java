package ray1024.caverngenerator;

public class CellularAutomaton<T extends Cell> {
    private final T[][] oldBuffer;
    private final T[][] newBuffer;
    private final CellRule<T> cellRule;

    public CellularAutomaton(int width, int height, CellRule cellRule) {
        this.cellRule = cellRule;
        oldBuffer = (T[][]) new Cell[width][height];
        newBuffer = (T[][]) new Cell[width][height];
    }
}
