public class HeapSort {

    public void heapSort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }
    void heapify(int[] arr, int n, int i) {
        int largest = i;      
        int left = 2 * i + 1;  
        int right = 2 * i + 2;
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }
    static void printArray(int[] arr) {
        for (int value : arr)
            System.out.print(value + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};

        System.out.println("Original array:");
        printArray(array);

        HeapSort sorter = new HeapSort();
        sorter.heapSort(array);

        System.out.println("Sorted array in ascending order:");
        printArray(array);
    }
}
