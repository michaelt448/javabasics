package builtins.lectures.lists;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have" + groceryList.size() + "items in your grocery list");
        for (String item: this.groceryList) {
            System.out.println(item);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        this.groceryList.set(position, newItem);
    }

    public void modifyGroceryItem(String oldItem, String newItem) {
        int position = findItem(oldItem);

        if (position >= 0 ) {
            modifyGroceryItem(position, newItem);
        }
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        this.groceryList.remove(position );
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        return position >= 0;
    }

    private int findItem(String searchItem) {
        return this.groceryList.indexOf(searchItem);
    }

}
