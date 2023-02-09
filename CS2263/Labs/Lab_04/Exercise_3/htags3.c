#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define M 100
#define N 10

void print(char arr[M][N], int l);

void duplicate(char arr[M][N], int l) {
    int i = 0;
    int j = 0;
    for(i = 0; i < l; i++) {
        for(j = (i+1); j < l; j++) {
            int result = strcmp(*(arr+i), *(arr+j));
            if(result == 0) {
                arr[i][0] = '\0';
            }
        }  
    }
    print(arr, l);
}
