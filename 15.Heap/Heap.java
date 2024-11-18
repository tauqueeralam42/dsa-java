import java.util.ArrayList;

public class Heap {

    ArrayList<Integer> heap = new ArrayList<>();

    public void insert(int val) {
        heap.add(val);

        int index = heap.size() - 1;

        while (index > 0) {
            int parent = (index - 1) / 2;
            if (heap.get(index) < heap.get(parent)) {
                int temp = heap.get(index);
                heap.set(index, heap.get(parent));
                heap.set(parent, temp);
                index = parent;
            } else {
                break;
            }
        }
    }

    public int peek() {
        return heap.get(0);
    }

    public boolean isEmpty() {
        return heap.size() == 0;
    }

    public int remove() {
        int remove = heap.get(0);

        // swap the first and last element
        heap.set(0, heap.get(heap.size() - 1));

        // delete the last element
        heap.remove(heap.size() - 1);

        // heapify
        heapify(0);

        return remove;

    }

    private void heapify(int index) {
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        int smallest = index;

        if (left < heap.size() && heap.get(left) < heap.get(smallest)) {
            smallest = left;
        }

        if (right < heap.size() && heap.get(right) < heap.get(smallest)) {
            smallest = right;
        }

        if (smallest != index) {
            int temp = heap.get(index);
            heap.set(index, heap.get(smallest));
            heap.set(smallest, temp);

            heapify(smallest);
        }
    }

    public void print() {
        while (heap.size() > 0) {
            System.out.print(remove()+" ");
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();

        h.insert(10);
        h.insert(20);
        h.insert(15);
        h.insert(40);
        h.insert(50);
        h.insert(100);
        h.insert(25);
        h.insert(45);

        h.print();

    }
}
