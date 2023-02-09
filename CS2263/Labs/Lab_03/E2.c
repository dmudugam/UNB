#include <stdio.h>

int arr_element(int * aptr, int a[], int len) {
    int i;
    for(i=0; i<len; i++) {
        printf("%d  %d  %p  %d\n", i, a[i], (void *) aptr, *aptr);
        aptr++;
    }
   return 0;
}



int main() {
    int arr[] = {10, 11, 12, 13, 14, 15, 16};

    printf("(index / array_element_value / address / array_element_value): \n");
    arr_element(arr, &arr[0], (sizeof(arr)/sizeof(int)));
    
    return 0;
}