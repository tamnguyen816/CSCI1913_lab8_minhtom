/**
 * A class that stores, and typesets, a list of items.
 *
 * Minh Tam H Nguyen
 * CSCI 1913 Lab 8
 */


public class FirstLastTypeSetter extends ListTypeSetter {
    /**
     * Create a new typesetter
     *
     * @param maxItems the maximum number of items this object can store before crashing.
     *                 <p>
     *                 This is bug free
     */
    public FirstLastTypeSetter(int maxItems) {
        super(maxItems);
    }

    @Override
    protected String typeset(int index, String text){
        if(super.currentSize() == 1)
        {
            return " (only): " + text;
        }
        else{
            if(index == 0){
                return " (first): " + text;
            }
            else if (index == super.currentSize() -1 ){
                return " (last): " + text;
            }
            else{
                return " * " + text;
            }
        }
    }
}
