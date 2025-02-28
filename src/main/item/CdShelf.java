package main.item;

public class CdShelf extends Shelf {

    public static final int MAX_CDS_SIZE = 5;

    public CdShelf() {
    	maxCount =  MAX_CDS_SIZE;
    	products = new Production[maxCount];
    }

    public CdShelf(int size) {
    	maxCount = size;
    	products = new Production[maxCount];
    }

    @Override
    public boolean add(Production production) {
    	if(production instanceof Cd) {
        	products[count] = production;
        	count++;
            return true;
    	}
        return false;
    }

    @Override
    public String getText() {
    	return "CD";
    }
}