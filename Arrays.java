
import java.io.*;

public class Arrays {
    private int[] items;
    private int count = 0;

    public Arrays(int length) {
        items = new int[length];
    }

    public void print() {
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " ");
        }
    }

    public void insert(int num) {
        if (items.length == count) {
            int newItems[] = new int[count + 1];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
            items[count++] = num;
        } else {
            items[count++] = num;
        }
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }
        int[] newItems = new int[count - 1];

        for (int i = 0, j = 0; i < count; i++) {
            if (i == index) {
                continue;
            }
            newItems[j] = items[i];
            j++;
        }
        items = newItems;
        count--;
    }

    public void insertAt(int index, int num) {
        if (index < 0 || index > count) {
            throw new IllegalArgumentException("Index out of bounds");
        }

        int[] newItems = new int[count + 1];

        for (int i = 0, j = 0; i < count + 1; i++) {
            if (i == index) {
                newItems[i] = num;
            } else {
                newItems[i] = items[j];
                j++;
            }
        }

        items = newItems;
        count++;
    }
    public void removeByValue(int num){
        for (int i= 0; i<count; i++){
            if(num == items[i]){
                removeAt(i);
            }
        }
    }
    public int searchIndexOf(int num){
        for (int i=0; i<count; i++){
            if (num == items[i]){
                return i;
            }
        }
        return 0;
    }

}