function binarySearch(vetor, item, lPointer, rPointer) {
  let middleIndex = parseInt((lPointer + rPointer) / 2);
  let middleItem = vetor[middleIndex];

  if (vetor.length !== 0) {
    if (item < middleItem) {
      rPointer = middleIndex - 1;
      middleIndex = binarySearch(vetor, item, lPointer, rPointer)
    }

    else if (item > middleItem) {
      lPointer = middleIndex + 1;
      middleIndex = binarySearch(vetor, item, lPointer, rPointer)
    }

    return middleIndex;
  }

  else {
    console.log('Vetor vazio')
    return -1
  }
}
