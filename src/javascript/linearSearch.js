// Função que recebe como parâmetros: um vetor e um elemento a ser buscado.
// Caso o elemento seja encontrado, é retornado seu índice no array, caso contrário a função retorna -1.

function linearSearch(array, item) {
  lenArray = array.length;

  for (let x = 0; x < lenArray; x++) {
    if (array[x] == item) {
      return x;
    }
  }

  return -1;
}
