// Função que recebe como parâmetros: um vetor e um elemento a ser buscado.

// O elemento é adicionado no final do vetor, garantido que ele será encontrado pelo laço.
// Ao sair do laço será verificado se o índice encontrado é igual ao último índice da lista.
// Se eles forem diferentes, significa que o elemento foi encontrado no vetor, retornando o índice.
// Caso forem iguais, significa que o elemento não foi encontrado, retornando -1.


function sentinelSearch(array, item) {
  array.push(item);
  index = 0

  while (array[index] !== item) {
    index++
  }

  if (index !== array.length - 1) {
    return index
  }

  return -1;
}
