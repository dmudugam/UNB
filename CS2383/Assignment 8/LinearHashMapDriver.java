class LinearHashMap {
    private int currentSize, maxSize;
    private Integer[] vals;
    final double defaultLoadFactor = 0.75;

    public LinearHashMap(int capacity) {
        currentSize = 0;
        maxSize = capacity;
        vals = new Integer[maxSize];
    }

    public Integer[] expandArray() {
        currentSize = 0;
        maxSize = maxSize * 2;
        vals = new Integer[maxSize];
        return vals;
    }

    public int getSize() {
        return currentSize;
    }
    private int hash(int val) {
        return val % maxSize;
    }
    public void insert(int val) {
        int tmp = hash(val);
        int i = tmp;

        do {
            if (vals[i] == null) {
                vals[i] = val;
                currentSize++;
                break;
            }
            if(vals[i] != null) {
                i++;
            }

        }
        while (i != tmp);
        double loadFactor = (1.0 * currentSize) / maxSize;
        if(loadFactor > defaultLoadFactor) {
            rehash();
        }
    }
    private void rehash() {
        Integer [] tmp = vals;
        vals = expandArray();
        for(int j = 0; j < tmp.length; j++) {
            if(tmp[j] != null) {
                insert(tmp[j]);
            }
        }
    }
    public void printHashTable()
    {
        System.out.println("\nHash Table: ");
        for (int i = 0; i < maxSize; i++) {
            if (vals[i] != null) {
                System.out.println(i + " " + vals[i]);
            }
        }
        System.out.println();
    }
}

public class LinearHashMapDriver {

    public static void main(String[] args)
    {
        LinearHashMap hmap = new LinearHashMap(5);

        hmap.insert(1);
        hmap.insert(8);
        hmap.insert(5);
        hmap.insert(4);
        hmap.insert(3);
        hmap.insert(2);
        hmap.insert(7);
        hmap.insert(25);
        hmap.insert(10);
        hmap.insert(18);


        hmap.printHashTable();
    }
}