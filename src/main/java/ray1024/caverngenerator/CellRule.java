package ray1024.caverngenerator;

import java.util.function.Function;

public interface CellRule<T extends Cell> extends Function<T[], T> {
}
