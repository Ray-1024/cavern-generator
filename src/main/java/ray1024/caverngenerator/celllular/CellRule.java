package ray1024.caverngenerator.celllular;

import java.util.Collection;
import java.util.function.Function;

public interface CellRule<T extends Cell> extends Function<Collection<T>, T> {
}
