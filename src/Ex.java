import java.util.ArrayList;
import java.util.Arrays;

class Ex {

    public static <T> void swapPlaces(T[] arr, int one, int two) {

        T oneValue = arr[one];
        arr[one] = arr[two];
        arr[two] = oneValue;
        System.out.println(arr);

    }

    public static <T> ArrayList<T> converter(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}
