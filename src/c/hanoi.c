#include <stdio.h>

void hanoi(int discos, int O, int D, int A) {
    if (discos == 1) {
        printf("(%c,%c)\n", O, D);
        return;
    }

    // origem -> auxiliar
    hanoi(discos - 1, O, A, D);

    // origem -> destino
    printf("(%c,%c)\n", O, D);

    // auxiliar -> destino, origem(auxiliar)
    hanoi(discos - 1, A, D, O);
}

int main() {
    int entrada;

    printf("Utilizando 3 pinos O, D, A (origem, destino, auxiliar) quantos discos deseja utilizar ? ");
    scanf("%d", &entrada);
    hanoi(entrada, 'O', 'D', 'A');

    return 0;
}