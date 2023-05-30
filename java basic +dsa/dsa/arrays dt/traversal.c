#include<stdio.h>
#include<stdlib.h>

void main(){
      int arr[100];
      int usize;
      printf("the number of elements in arr:");
      scanf("%d", &usize);
      printf("Enter the elements:");
      for(int i = 0; i < usize; i++){
        scanf("%d", &arr[i]);
      }
    //   traversal 
    printf("the value after traversal");
      for(int i = 0;i<usize;i++){
        printf("%d\t", arr[i]);
      }


}