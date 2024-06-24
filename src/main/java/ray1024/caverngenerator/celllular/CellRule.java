package ray1024.caverngenerator.celllular;

import java.util.function.Function;

public interface CellRule<T extends Cell> extends Function<T[], T> {
}
