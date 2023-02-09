#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define M 100
#define N 10

void print(char arr[M][N], int l) {
    int g = 0;
   for(int k = 0; k < l; k++) {
        g = 0;
        while(arr[k][g] != '\0') {
            if(arr[k][g] != '\0') {
                printf("%c", arr[k][g]);
            }
            g++;
        }
        if(arr[k][g-1] != '\0') {
            printf("\n");
        }
   }
}
