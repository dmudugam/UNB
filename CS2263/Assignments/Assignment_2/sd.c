#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>

int main(int argc, char * argv[]) {
   int count = 0;
   char ch;
   char (*str[100])[10];
   int i = 0;
   FILE * fptr;
   
   if(argc < 2) {
      printf("Need to provide the file name \n");
      return EXIT_FAILURE;
   }
   else {
      fptr = fopen(argv[1], "r");
      
      if(fptr == NULL) {
         printf("fopen fail \n");
         return EXIT_FAILURE;
      }
      else {
         do {
            ch = fgetc(fptr);
            if(ch !=EOF) {
               if(ch == '<') {
                  do {
                     i = 0;
                     putchar(ch);
                     ch = fgetc(fptr);

                     if(ch == ' ' || ch == '>') {
                        putchar('>');
                        i = 1;
                     }
                     
                  }
                  while (i == 0);
               }
            }
         }
         while (ch != EOF);
      }
      fclose(fptr);
   }
   
   return 0;
}