#include<stdio.h>
int linearsrh(int arr[],int s,int k){
    for(int i=0;i<s;i++){
        if(k==arr[i]){
            printf("found the element...\n");
            return i;
        }
    }
    printf("NOT found the element\n");
    return -1;
}
void main(){
    int arr[]={1,34,56,78,89};
    int size=sizeof(arr)/sizeof(arr[0]);
    int key;
    scanf("%d",&key);
    int x =linearsrh(arr,size,key);
    printf("the key %d found at index: %d",key,x);
}