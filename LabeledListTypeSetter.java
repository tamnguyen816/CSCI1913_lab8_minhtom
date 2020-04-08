/**
 * A class that stores, and typesets, a list of items.
 *
 * Minh Tam H Nguyen
 * CSCI 1913 Lab 8
 */

public class LabeledListTypeSetter extends ListTypeSetter {
    /**
     * Create a new typesetter
     *
     * @param maxItems the maximum number of items this object can store before crashing.
     *                 <p>
     *                 This is bug free
     */
    private String label;

    public LabeledListTypeSetter(String label, int maxItems) {
        super(maxItems);
        this.label = label;
    }

    public void setLabel(String haha){
         this.label = haha;
    }

    @Override
    protected String typeset(int index, String text){
        if(index == 0)
        {
            System.out.println(this.label);
            String equal = "";
            for(int i = 0; i < this.label.length(); i++)
            {
                equal += "=";
            }
            System.out.println(equal);
        }
        return index + 1 + ".  " + text;

    }

}
