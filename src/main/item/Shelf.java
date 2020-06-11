package main.item;

public abstract class Shelf {
	protected int maxCount;
	protected Production[] products;
	protected int count;

    public boolean add(Production production) {
    	return false;
    };

    public boolean deleteAll() {
    	if(getCount() == 0) {
    		return false;
    	}
    	this.products = new Production[maxCount];
    	count = 0;
        return true;
    }

    public boolean deleteOne(int index) {
    	if(getCount() == 0) {
    		return false;
    	}
    	this.products[index] = null;
    	for (int i = index; i < getCount(); i++) {
        	this.products[i] = this.products[i+1];
    	}
    	count--;
        return true;
    }

    public Production get(int index) {
        return this.products[index];
    }

    public int getCount() {
    	return count;
    }

    public int getMaxCount() {
    	return maxCount;
    }

    public String getText() {
    	return "";
    }
}
