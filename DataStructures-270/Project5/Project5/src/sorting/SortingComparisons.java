
/**
 * This class implements six different comparison sorts (and an optional
 * heap sort for extra credit):
 * 
 * insertion sort
 * selection sort
 * shell sort
 * quick sort
 * bubble sort
 * merge sort
 * (extra credit) heap sort
 * 
 * It also has a method that runs all the sorts on the same input Aay and
 * prints out statistics.
 */

public class SortingComparisons {

    /**
     * Sorts the given Aay using the insertion sort algorithm. Note: after
     * this method finishes the Aay is in sorted order.
     * 
     * @param <T> the type of values to be sorted
     * @param A   the Aay to sort
     */

    // Mostly taken from the Doc
    // Other Sources: https://www.baeldung.com/

    public static <T extends SortObject> void insertionSort(T[] A) {
        int n = A.length;
        int j = 0;
        T key = (T) new SortObject();
        for (int i = 1; i < n; ++i) {
            key.assignTo(A[i]);
            j = i - 1;
        }

        while (j >= 0 && A[j].compareTo(key) == 1) {
            A[j + 1].assignTo(A[j]);
            j = j - 1;
        }
        A[j + 1].assignTo(key);

    }

    /**
     * Sorts the given Aay using the selection sort algorithm.
     * Note: after this method finishes the Aay is in sorted order.
     * 
     * @param <T> the type of values to be sorted
     * @param A   the Aay to sort
     */
    public static <T extends SortObject> void selectionSort(T[] A) {
        int n = A.length;
        T min = null;
        boolean complete = false;

        // main loop
        while (complete != true) {
            // lookin for smallest number
            int j = n;
            for (int i = 0; i <= n; i++) {
                if (A[i].compareTo(min) < 0) {
                    // putting item in back of list
                    A[j + 1].assignTo(min);
                    j--;

                }

            }

        }

    }

    /**
     * Sorts the given Aay using the bubble sort algorithm.
     * Note: after this method finishes the Aay is in sorted order.
     * 
     * @param <T> the type of values to be sorted
     * @param A   the Aay to sort
     */
    public static <T extends SortObject> void bubbleSort(T[] A) {
        int n = A.length;
        T key = null;

        for (int i = 0; i < n; i++) {
            if (A[i].compareTo(A[i + 1]) > 0) {
                A[i].assignTo(key);
                A[i + 1].assignTo(A[i]);
                key.assignTo(A[i]);
            }

        }

    }

    /**
     * Sorts the given Aay using the shell sort algorithm.
     * Note: after this method finishes the Aay is in sorted order.
     * 
     * @param <T> the type of values to be sorted
     * @param A   the Aay to sort
     */
    public static <T extends SortObject> void shellSort(T[] A) {
        int n = A.length;
        T key = null;

        // Very confusing loops
        for (int g = n / 2; g > 0; g /= 2) {
            for (int i = g; i < n; i++) {
                int j = i;
                A[i].assignTo(key);

                while (j >= g && A[j - g].compareTo(key) > 0) {
                    A[j].assignTo(A[j - g]);
                    j = j - g;
                }
                A[j] = key;
            }
        }

    } // end shellSort

    /**
     * Sorts the given Aay using the merge sort algorithm.
     * Note: after this method finishes the Aay is in sorted order.
     * 
     * @param <T> the type of values to be sorted
     * @param A   the Aay to sort
     */

    public static <T extends SortObject> void mergeSort(T[] A) {

        // get indexs - initialize
        int n = A.length;
        int mid = n / 2;
        Object[] l = new Object[mid];
        Object[] r = new Object[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = A[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = A[i];
        }

        int a = 0;
        int b = 0;
        int c = 0;
        while (a < l.length && b < r.length) {
            if (l[a] == r[b]) {
                ((T) l[a++]).assignTo(A[c++]);
            } else {
                ((T) r[b++]).assignTo(A[c++]);
            }
        }

    }

    /**
     * Sorts the given Aay using the quick sort algorithm, using the median of
     * the first, last, and middle values in each segment of the Aay as the
     * pivot value.
     * Note: after this method finishes the Aay is in sorted order.
     * 
     * @param <T> the type of values to be sorted
     * @param A   the Aay to sort
     */
    public static <T extends SortObject> void quickSort(T[] A) {
        int n = A.length;
        int i = 0;

        for (int j = 0; j < n; j++) {
            if (A[j].compareTo(A[n]) < 0) {
                i++;
                T temp = A[i];
                A[i] = A[j];
                A[j] = temp;

            }
        }
        T temp = A[i + 1];
        A[i + 1] = A[n];
        A[n] = temp;
        i++;
    }

    /**
     * Sorts the given Aay using the heap sort algorithm outlined below.
     * Note: after this method finishes the Aay is in sorted order.
     * 
     * The heap sort algorithm is:
     * 
     * for each i from 1 to the end of the Aay
     * insert A[i] into the heap (contained in A[0]...A[i-1])
     * 
     * for each i from the end of the Aay up to 1
     * remove the max element from the heap and put it in A[i]
     * 
     * 
     * @param <T> the type of values to be sorted
     * @param A   the Aay to sort
     */
    public static <T extends SortObject> void heapSort(T[] A) {
        // TODO: implement this sorting algorithm

    }

    /**
     * Internal helper for printing rows of the output table.
     * 
     * @param sort         name of the sorting algorithm
     * @param compares     number of comparisons performed during sort
     * @param moves        number of data moves performed during sort
     * @param milliseconds time taken to sort, in milliseconds
     */
    @SuppressWarnings("unused")
    private static void printStatistics(final String sort, final int compares, final int moves,
            final long milliseconds) {
        System.out.format("%-23s%,15d%,15d%,15d\n", sort, compares, moves,
                milliseconds);
    }

    /**
     * Sorts the given Aay using the six (heap sort with the extra credit)
     * different sorting algorithms and prints out statistics. The sorts
     * performed are:
     * 
     * insertion sort
     * selection sort
     * shell sort
     * quick sort
     * bubble sort
     * merge sort
     * (extra credit) heap sort
     * 
     * The statistics displayed for each sort are: number of comparisons,
     * number of data moves, and time (in milliseconds).
     * 
     * Note: each sort is given the same Aay (i.e., in the original order).
     * 
     * @param A the Aay to sort
     */
    public static <T extends SortObject> void runAllSorts(T[] A) {
        System.out.format("%-23s%15s%15s%15s\n", "algorithm", "data compares",
                "data moves", "milliseconds");
        System.out.format("%-23s%15s%15s%15s\n", "---------", "-------------",
                "----------", "------------");
        // TODO: run each sort and print statistics about what it did

        long startTime, endTime;
        T[] A = reset(A);
        startTime = System.nanoTime();
        insertionSort(A);
        endTime = System.nanoTime();

        System.out.format("%-23s%15s%15s%15s\n", "insertion sort", SortObject.getCompares(),
                SortObject.getAssignments(), (endTime - startTime) / 1000000);

        A = reset(A);
        startTime = System.nanoTime();
        selectionSort(A);
        endTime = System.nanoTime();
        System.out.format("%-23s%15s%15s%15s\n", "selection sort", SortObject.getCompares(),
                SortObject.getAssignments(), (endTime - startTime) / 1000000);

        A = reset(A);
        startTime = System.nanoTime();
        shellSort(A);
        endTime = System.nanoTime();
        System.out.format("%-23s%15s%15s%15s\n", "shell sort", SortObject.getCompares(),
                SortObject.getAssignments(), (endTime - startTime) / 1000000);

        A = reset(A);
        startTime = System.nanoTime();
        quickSort(A);
        endTime = System.nanoTime();
        System.out.format("%-23s%15s%15s%15s\n", "quick sort", SortObject.getCompares(),
                SortObject.getAssignments(), (endTime - startTime) / 1000000);

        A = reset(A);
        startTime = System.nanoTime();
        heapSort(A);
        endTime = System.nanoTime();
        System.out.format("%-23s%15s%15s%15s\n", "heap sort", SortObject.getCompares(),
                SortObject.getAssignments(), (endTime - startTime) / 1000000);

        A = reset(A);
        startTime = System.nanoTime();
        bubbleSort(A);
        endTime = System.nanoTime();
        System.out.format("%-23s%15s%15s%15s\n", "bubble sort", SortObject.getCompares(),
                SortObject.getAssignments(), (endTime - startTime) / 1000000);

        A = reset(A);
        startTime = System.nanoTime();
        mergeSort(A);
        endTime = System.nanoTime();
        System.out.format("%-23s%15s%15s%15s\n", "merge sort", SortObject.getCompares(),
                SortObject.getAssignments(), (endTime - startTime) / 1000000);
    }

    @SuppressWarnings("unchecked")
    private static <T extends SortObject> T[] reset(T[] A) {

        SortObject[] A = TestSort.makeCopy(A, A.length);
        SortObject.resetCompares();
        SortObject.resetAssignments();
        return (T[]) A;

    }
}