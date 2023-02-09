#include <stdio.h>
#include <stdlib.h>
#include <string.h>



int main(int argc, char * * argv) {
  int x = -2;
  int arr[] = {0, 1, 2, 3, 4};
  int y = 15;



  printf("& x = %p  \n& y = %p\n\n", & x, & y);



  printf("& arr[0] = %p\n",& arr[0]);
  printf("& arr[1] = %p\n",& arr[1]);
  printf("& arr[2] = %p\n",& arr[2]);
  printf("& arr[3] = %p\n",& arr[3]);
  printf("& arr[4] = %p\n\n",& arr[4]);



  printf("x = %d, y = %d\n\n", x, y);



  arr[-1] = 7;
  arr[5]  = -23;
  printf("x = %d, y = %d\n", x, y);
  printf("& arr[-1] = %p\n", &arr[-1]);
  printf("& arr[5] = %p\n\n", &arr[5]);



  arr[6]  = 108;
  printf("x = %d, y = %d\n", x, y);
  printf("& arr[6] = %p\n\n", &arr[6]);



  arr[7]  = -353;
  printf("x = %d, y = %d\n", x, y);
  printf("& arr[7] = %p\n", &arr[7]);



  return EXIT_SUCCESS;
}