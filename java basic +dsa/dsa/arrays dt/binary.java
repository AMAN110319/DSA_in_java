import java.util.Arrays;
import java.util.*;
public class binary{
    static int binarysrc(int arr[], int size, int element)
{
    int l = 0, h = size - 1;
    while (l <= h)
    {
        int mid = (l + h) / 2;
        if (arr[mid] == element)
        {
            return mid;
        }
        if (arr[mid] < element)
        {
            l = mid + 1;
        }
        else
        {
            h = mid - 1;
        }
    }
    return -1;
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []arr = {33,45,67,32,56,22};
        Arrays.sort(arr);
        int size=6;
        int element = scanner.nextInt();
        int x=binarysrc(arr, size, element);
        System.out.println("the element found on index " + x);
    }
}
