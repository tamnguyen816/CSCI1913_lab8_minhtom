import java.util.List;

/**
 * A class that stores, and typesets, a list of items.
 *
 * Minh Tam H Nguyen
 * CSCI 1913 Lab 8
 */

public class PreSpecifiedMarksTypeSetter extends ListTypeSetter {
    private String[] label;
    /**
     * Create a new typesetter
     *
     * @param maxItems the maximum number of items this object can store before crashing.
     *                 <p>
     *                 This is bug free
     */
    public PreSpecifiedMarksTypeSetter(String[] label) {
        super(label.length);
        this.label = label;
    }

    @Override
    protected String typeset(int index, String text) {
        return label[index] + " " + text;
    }
}
