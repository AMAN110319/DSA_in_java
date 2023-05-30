#include <stdio.h>
#include <stdlib.h>

void insertionarr(int a[], int u, int n, int i, int t)
{
    if (u >= t)
    {
        printf("overflow");
    }
    else
    {
        for (int j = u - 1; j >= i; j--)
        {

            a[j + 1] = a[j];
        }
        a[i] = n;
        // u = u + 1;
    }
}

// traversal using functions
void display(int a[], int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%d\t", a[i]);
    }
    printf("\n");
}
void main()
{
    int arr[100] = {0, 1, 2, 9, 4, 5, 6};

    int usize = 7, tsize = 100;
    display(arr, usize);
    // int num=33,index=3;
    // insertionarr(arr,usize,num,index,tsize);
    // usize++;
    // display(arr,usize);
    // num=31,index=5;
    // insertionarr(arr,usize,num,index,tsize);
    // usize++;
    // display(arr,usize);
    // num=243,index=0;
    // insertionarr(arr,usize,num,index,tsize);
    // usize++;
    // display(arr,usize);
    int num,index;
    for (int i = 0; i < 5; i++)
    {
        scanf("%d", &num);
        scanf("%d", &index);
        insertionarr(arr, usize, num, index, tsize);
        usize++;
        display(arr, usize);
    }
}