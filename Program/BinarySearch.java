import java.util.*;

class BinarySearch {

    public static void main(String[] args) {

        int a[] = {1, 55, 88, 22, 33, 99};
        int searchValue = 22;

        // Sort the array
        Arrays.sort(a);

        int low = 0;
        int high = a.length - 1;

        boolean found = false;

        // Binary search loop
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (a[mid] == searchValue) {
                System.out.println("Searched Value = " + searchValue);
               // System.out.println("Mid Index Array = " + mid);
                found = true;
                break;
            }

            if (a[mid] > searchValue) {
                high = mid - 1;
            } 

			if(a[mid] < searchValue) {
                low = mid + 1;
            }
        }

        if (!found) {
            System.out.println("Value not found in the array.");
        }
    }
}
