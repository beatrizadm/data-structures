#include <stdio.h>

long int dec_bin(long int n) {
    if (n == 0) {
        return 0;
    } else {
        return (n % 2 + 10 * dec_bin(n / 2));
    }
}

int main() {
    long int n, num;

    printf("Quantos números você deseja converter: ");
    scanf("%lu", &n);
    while (n > 0) {
        printf("Digite o valor: ");
        scanf("%lu", &num);

        printf("%lu decimal é %lu em binário.\n", num, dec_bin(num));
        n--;
    }

    return 0;
}