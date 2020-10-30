function mergeSort(array) {
  if (array.length <= 1) return array;

  const array1 = mergeSort(array.slice(0, array.length / 2));
  const array2 = mergeSort(array.slice(array.length / 2, array.length));

  return merge(array1, array2);
}

function merge(array1, array2) {
  const result = [];

  let i = 0;
  let j = 0;

  while (i < array1.length && j < array2.length) {
    if (array1[i] < array2[j]) {
      result.push(array1[i++]);
    } else {
      result.push(array2[j++]);
    }
  }

  while (i < array1.length) result.push(array1[i++]);

  while (j < array2.length) result.push(array2[j++]);

  return result;
}
