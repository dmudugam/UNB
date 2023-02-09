#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define M 100
#define N 10

void print(char arr[M][N], int l);
void duplicate(char arr [M][N], int l);

int main() {
   int ch;
   char str[M][N];
   int i = 0;
   int j = 0;
   int y = 0;
   
   while((ch = getchar()) != EOF) {
        y = 0;
        if(ch == '<') {
            ch = getchar();
            do {
                i = 0;
                if(ch == '\n' || ch == '\t') {
                    break;
                }
                if(ch == '>' || ch == ' ') {
                    str[j][y] = '\0';
                    break;

                }
                if(ch == '<') {
                    break;
                }
                if(ch == '/') {
                    ch = getchar();
                }
                str[j][y] = ch;
                ch = getchar();
                y++;
            }
            while (i == 0);
            j++;
        }
    }
    duplicate(str, j);

   return 0;
}
