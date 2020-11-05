#include <stdio.h>

unsigned long int reverso(unsigned long int n) {
    unsigned long int aux, mult, rev;

    aux = n;
    mult = 1;
    while (aux >= 10) {
        aux /= 10;
        mult *= 10;
    }
    aux = n;
    rev = 0;

    while (mult > 0) {
        rev += (aux % 10) * mult;
        aux /= 10;
        mult /= 10;
    }
    return rev;
}

int main() {
    unsigned long int num;

    printf("Digite o número (inteiro positivo) que deseja inverter: ");
    scanf("%lu", &num);
    printf("%lu\n", reverso(num));

    return 0;
}