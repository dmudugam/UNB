#include <stdio.h>

void print_rev(char *s);

int main(void)
{
    char *str;
    str = "I do not fear computers. I fear the lack of them - Isaac Asimov";
    print_rev(str);
    return (0);
}

// read array and print it out backwards char by char.
void print_rev(char *s)
{
    int arrLength;

    arrLength = 0;

    // capture length of array
    while (*s != '\0') {
        arrLength++;
        s++;
    }

    arrLength--;

    // print array backwards
    for (; arrLength >= 0; arrLength--) {
        putchar(s[arrLength]);
    }

    putchar('\n');
}