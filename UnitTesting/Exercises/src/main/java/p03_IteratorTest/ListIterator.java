package p03_IteratorTest;

import javax.naming.OperationNotSupportedException;
import java.util.Arrays;
import java.util.List;

public class ListIterator {
    private List<String> elements;
    private int currentIndex;

    public ListIterator(String... elements) throws OperationNotSupportedException {
        if (elements == null) {
            throw new OperationNotSupportedException();
        }

        this.elements = Arrays.asList(elements);
        this.currentIndex = 0;
    }
}
