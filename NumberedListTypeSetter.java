/**
 * A class that stores, and typesets, a list of items.
 *
 * Minh Tam H Nguyen
 * CSCI 1913 Lab 8
 */

public class NumberedListTypeSetter extends ListTypeSetter {
    /**
     * Create a new typesetter
     *
     * @param maxItems the maximum number of items this object can store before crashing.
     *                 <p>
     *                 This is bug free
     */
    public NumberedListTypeSetter(int maxItems) {
        super(maxItems);
    }

    @Override
    protected String typeset(int index, String text) {
        return index + 1 + ".  " + text;
    }


}
