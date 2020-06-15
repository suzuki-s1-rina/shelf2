package main.item;

public class BookShelf extends Shelf {

    public static final int MAX_BOOKS_SIZE = 5;

    public BookShelf() {
    	maxCount = MAX_BOOKS_SIZE;
    	products = new Production[maxCount];
    }

    public BookShelf(int size) {
    	maxCount = size;
    	products = new Production[maxCount];
    }

    @Override
    public boolean add(Production production) {
    	if(production instanceof Book) {
        	products[count] = production;
        	count++;
            return true;
    	}
        return false;
    }

    @Override
    public String getText() {
    	return "本";
    }
}
