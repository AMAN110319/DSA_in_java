#include <stdio.h>
int binarysrc(int arr[], int size, int element)
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

void main()
{
    int arr[] = {0, 1, 2, 3, 4, 5, 23, 54};
    int size = sizeof(arr) / sizeof(arr[0]);
    int element;
    scanf("%d", &element);
    int x = binarysrc(arr, size, element);
    printf("the index of element is: %d\n", x);
}