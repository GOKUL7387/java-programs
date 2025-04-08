
public class MaxHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MaxHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity + 1];
    }
    private int parent(int index) { return index / 2; }
    private int leftChild(int index) { return 2 * index; }
    private int rightChild(int index) { return 2 * index + 1; }
    public void insert(int value) {
        if (size >= capacity) {
            System.out.println("Heap is full. Cannot insert.");
            return;
        }

        size++;
        heap[size] = value;
        int current = size;

        while (current > 1 && heap[current] > heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }
    public int deleteMax() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }

        int max = heap[1];
        heap[1] = heap[size];
        size--;
        heapify(1);

        return max;
    }
    private void heapify(int index) {
        int largest = index;
        int left = leftChild(index);
        int right = rightChild(index);

        if (left <= size && heap[left] > heap[largest])
            largest = left;

        if (right <= size && heap[right] > heap[largest])
            largest = right;

        if (largest != index) {
            swap(index, largest);
            heapify(largest);
        }
    }
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
    public void printHeap() {
        System.out.print("Heap: ");
        for (int i = 1; i <= size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(10);

        maxHeap.insert(50);
        maxHeap.insert(30);
        maxHeap.insert(20);
        maxHeap.insert(15);
        maxHeap.insert(8);
        maxHeap.insert(60);

        maxHeap.printHeap();

        System.out.println("Deleted max: " + maxHeap.deleteMax());
        maxHeap.printHeap();
    }
}
