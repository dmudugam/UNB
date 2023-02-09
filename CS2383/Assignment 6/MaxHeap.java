import java.util.ArrayList;

public class MaxHeap{
    private void insert(ArrayList<Integer> maxHeap, int newNum) {
        if (maxHeap.size() == 0) {
            maxHeap.add(newNum);
        }
        else {
            maxHeap.add(newNum);
            for(int i = ((maxHeap.size()/2)-1); i >= 0; i--) {
                heapSort(maxHeap, i);
            }
        }
    }

    private void delete(ArrayList<Integer> maxHeap, int num) {
        int i = 0;
        for(i = 0; i < maxHeap.size(); i++) {
            if (num == maxHeap.get(i)) {
                break;
            }
        }

        maxHeap.set(i, maxHeap.get(maxHeap.size()-1));
        maxHeap.set(maxHeap.size()-1, maxHeap.get(i));
        maxHeap.remove(maxHeap.size()-1);

        for(int k = ((maxHeap.size()/2)-1); 0 <= k; k--) {
            heapSort(maxHeap, k);
        }
    }
    private void deleteRoot(ArrayList<Integer> maxHeap) {
        delete(maxHeap, maxHeap.get(0));
    }

    private void print(ArrayList<Integer> array) {
        String string = "";
        for(int i = 0; i < array.size(); i++) {
            string += array.get(i) + " ";
        }
        System.out.println(string);
    }

    private void heapSort(ArrayList<Integer> array, int key) {

        int right = ((2* key)+2);
        int left = ((2* key)+1);
        int large = key;

        if((array.size() > right) && (array.get(large) < array.get(right))) {
            large = right;

        }
        if((array.size() > left) && (array.get(large) < array.get(left))) {
            large = left;
        }

        if(large != key) {
            int largestNumber = array.get(large);
            array.set(large, array.get(key));
            array.set(key, largestNumber);

            heapSort(array, large);
        }
    }

    public static void main(String args[]) {

        ArrayList<Integer> maxHeap = new ArrayList<Integer>();

        MaxHeap mheap = new MaxHeap();
        mheap.insert(maxHeap, 22);
        mheap.insert(maxHeap, 15);
        mheap.insert(maxHeap, 36);
        mheap.insert(maxHeap, 44);
        mheap.insert(maxHeap, 10);
        mheap.insert(maxHeap, 3);
        mheap.insert(maxHeap, 9);
        mheap.insert(maxHeap, 13);
        mheap.insert(maxHeap, 29);
        mheap.insert(maxHeap, 25);

        System.out.println("Max Heap: ");
        mheap.print(maxHeap);
        System.out.println("");
        System.out.println("Removing root 10 times\n");

        for(int i = 0; i < 10; i++) {
            System.out.println("Removing Root: " + maxHeap.get(0));
            mheap.deleteRoot(maxHeap);
        }
        System.out.println("\nMax Heap After Removing 10 times: ");
        mheap.print(maxHeap);
    }
}