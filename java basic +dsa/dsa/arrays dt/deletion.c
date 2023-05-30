#include<stdio.h>


void main(){
    int arr[10]={0,1,2,3,4,5,6};
    int index;
    int size = 7;
    scanf("%d",&index);
    int value = arr[index];
    for(int i=0; i<size; i++){
        printf("%d\t",arr[i]);
    }
    printf("\n");
    for(int i=index; i<size; i++){
        arr[i]=arr[i+1];
    }
    size--;
    printf("the value is %d\n",value);

    for(int i=0; i<size; i++){
        printf("%d\t",arr[i]);
    }



}