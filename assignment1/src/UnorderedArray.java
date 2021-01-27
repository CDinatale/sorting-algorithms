// Corradina Dinatale
// 100645103

public class UnorderedArray {

    private int[] arr;
    private int maxSize;
    private int numElements;

    public UnorderedArray(int size) {
        maxSize = size;
        arr = new int[maxSize];
        numElements = 0;
    }

    public int[] getArr() {
        return arr;
    }

    public int getNumElements() {
        return numElements;
    }

    public void addLast(int key) {
        if (numElements < maxSize) {
            arr[numElements] = key;
            numElements++;
        }
    }

    public void copyArray(UnorderedArray a, int length) {
        for (int i = 0; i < length; i++) {
            int val = arr[i];
            a.addLast(val);
        }
    }

    public void selectionSort() {
        //get starting point
        for (int x = 0; x < numElements; x++) {
            //find the smallest from the selected point onward
            int locSmall = x;
            for (int y = x + 1; y < numElements; y++) {
                if (arr[y] < arr[locSmall]) {
                    locSmall = y;
                }
            }
            //swap
            int temp = arr[x];
            arr[x] = arr[locSmall];
            arr[locSmall] = temp;

        }
    }

    public void insertionSort() {
        for (int x = 1; x < numElements; x++) { //get the starting point
            int temp = arr[x]; //take the item out
            int pos = x - 1;
            while (pos >= 0 && arr[pos] > temp) {
                arr[pos + 1] = arr[pos]; //shift item up
                pos--;
            }
            arr[pos + 1] = temp; //insert item in the empty spot
        }
    }

    public void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    private int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }

    public void print(){
        for (int i=0; i<numElements; i++)
            System.out.println(arr[i] + " ");
    }
}
