#include <stdio.h>
#include <string.h>

void printMessage(char msg[], int n);
void printNumber(unsigned int i);
int conversion(int numb[], int count);

int main () {
   char message[] = "Hello World";
   char msg[] = "Enter a binary Number : ";
   char msg1[] = "Decimal Number : ";
   int count = 0;
   int binb[100];
   int ch;
   int j = strlen(message);
   printMessage(message, j);
   putchar('\n');
   printNumber(2263);
   putchar('\n');
   printMessage(msg, strlen(msg));
   while((ch = getchar()) != '\n') {
      ch = ch - 48;
      binb[count] = ch;
      count++;
   }
   printMessage(msg1, strlen(msg1));
   printNumber(conversion(binb, count));
   return(0);
}
void printMessage(char msg[], int n) {
   for(int c = 0; c < n; c++) {
      putchar(msg[c]);
   }
}
void printNumber(unsigned int i) {
   if(i != 0) {
      printNumber(i/10);
      putchar((i%10)+ '0');
   }
}
int conversion(int numb[], int count) {
   int decimal = 0;
   int b = 1;

   while(count != 0) {
      decimal = decimal + (numb[count-1] * b);
      b = b * 2;
      count--;
   }
   
   return decimal;
}