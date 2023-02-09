#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#define M 100
#define N 10

void printAll(char arr[M][N], int l);
void duplicate(char arr [M][N], int l, int u);
void printCaps(char arr[M][N], int l);

int main(int argc, char * argv[]) {
   int ch;
   char str[M][N];
   FILE * fptr;
   int i = 0;
   int j = 0;
   int y = 0;
   
   if(argc < 2) {
      printf("Need to provide the file name \n");
      return EXIT_FAILURE;
   }
   else {
        fptr = fopen(argv[argc-1], "r");

        if(fptr == NULL) {
            printf("fopen fail \n");
            return EXIT_FAILURE;
        }
        else {
            while((ch = fgetc(fptr)) != EOF) {
                y = 0;
                if(ch == '<') {
                    str[j][y] = ch;
                    y++;
                    ch = fgetc(fptr);
                    do {
                        i = 0;
                        if(ch == '\n' || ch == '\t') {
                            break;
                        }
                        if(ch == '>' || ch == ' ') {
                            str[j][y] = '>';
                            y++;
                            str[j][y] = '\0';
                            break;
                        }
                        if(ch == '<') {
                            break;
                        }
                        if(ch == '/') {
                            ch = fgetc(fptr);
                        }
                        str[j][y] = ch;
                        ch = fgetc(fptr);
                        y++;
                    }
                    while (i == 0);
                    j++;
                }
            }
        }
        fclose(fptr);
        
        
    }
   if((strcmp(argv[1], "-u") == 0) && argc == 3) {
        duplicate(str, j, 0);
   }
   else if(strcmp(argv[1], "-a") == 0 && argc == 3) {
        printAll(str, j);
   }
   else if(((strcmp(argv[1], "-u") == 0 && strcmp(argv[2], "-c") == 0) || (strcmp(argv[2], "-u") == 0 && strcmp(argv[1], "-c") == 0)) && argc == 4) {
        duplicate(str, j, 1);
   }
   else if(((strcmp(argv[1], "-a") == 0 && strcmp(argv[2], "-c") == 0) || (strcmp(argv[2], "-a") == 0 && strcmp(argv[1], "-c") == 0)) && argc == 4) {
        printCaps(str, j);
   }
   else if(strcmp(argv[1], "-c") == 0 && argc == 3) {
        duplicate(str, j, 1);
   }
   else {
        duplicate(str, j, 0);
   }

   return 0;
}


void printCaps(char arr[M][N], int l) {
    int g = 0;
    int k = 0;
   for(k = 0; k < l; k++) {
        g = 0;
        while(arr[k][g] != '\0') {
            if(arr[k][g] != '\0') {
                printf("%c", toupper(arr[k][g]));
            }
            g++;
        }
        if(arr[k][g-1] != '\0') {
            printf("\n");
        }
   }
}

void duplicate(char arr[M][N], int l, int u) {
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
    if (u == 0) {
        printAll(arr, l);
    }
    else {
        printCaps(arr, l);
    }
    
    
}

void printAll(char arr[M][N], int l) {
    int g = 0;
    int k = 0;
   for(k = 0; k < l; k++) {
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