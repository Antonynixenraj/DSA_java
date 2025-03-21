public class bubble_sort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            // Flag to check if swapping occurred
            boolean swapped = false;

            // Last i elements are already sorted
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element is greater than the next
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped, break
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] data = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array:");
        for (int num : data) {
            System.out.print(num + " ");
        }

        // Perform bubble sort
        bubbleSort(data);

        System.out.println("\nSorted array:");
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}
