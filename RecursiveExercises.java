import java.util.Arrays;

public class RecursiveExercises {



public static int findMax(int[] arr, int left, int right) {

    // Split array into two halves


    int middle = (left + right) / 2;

    // Recursively find max in both halves

    int leftMax = findMax(arr, left, middle);
    int rightMax = findMax(arr, middle + 1, right);

    // Create result variable to avoid multiple return statements

    int result = 0;

    // Compare both halves and return the larger one

    if (leftMax > rightMax) {
        result = leftMax;
    } else {
        result = rightMax;
    }

    return result;


}

public static void reverseArray(int[] arr, int left, int right) {

    // Base case: Array is length <= 1

    if (left >= right) {
        return;
    }

    int temp = arr[left];

    arr[left] = arr[right];

    arr[right] = temp;

    left += 1;
    right -= 1;

    reverseArray(arr, left, right);


}

public static int countOccurences(int[] arr, int target, int index) {

    if (index >= arr.length) {
        return 0;
        
    }

    if (arr[index] == target) {
        return 1 + countOccurences(arr, target, index + 1);
    } else {
        return countOccurences(arr, target, index + 1);
    }

    
}

public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    reverseArray(arr, 0, arr.length - 1);

    System.out.println(Arrays.toString(arr));

    findMax(arr, 0, 0);
    System.out.println(Arrays.toString(arr));

    
}

public static int binarySearch(int[] arr, int target, int left, int right) {

    if (left > right) {
        return -1;
    }

    int mid = (left + right) / 2;

    if (arr[mid] == target) {
        return mid;
    } else if (target < arr[mid]) {
        return binarySearch(arr, target, left, mid - 1);
    } else {
        return binarySearch(arr, target, left, mid + 1);
    }


}

public static int linearSearch(int[] arr, int target, int index) {
    if (index >= arr.length) {
        return -1;
    }
    if (arr[index] == target) {
        return index;
    }

    return linearSearch(arr, target, index + 1);
}



    
}
