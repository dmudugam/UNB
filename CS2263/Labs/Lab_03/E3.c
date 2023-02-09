#include <stdio.h>

int arrindex(int * p1, int * p2) {
    int index = p2 - p1;
    return index;
}

int main() {
    int arr[] = {10, 11, 12, 13, 14, 15, 16};
    int i;

    for(int i; i < sizeof(arr)/sizeof(arr[0]); i++) {
        printf(" %d   %d \n", i, arrindex(&arr[0], &arr[i]));
    }    

   return 0;
}