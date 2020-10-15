function swap(array, i, j) {
  let temp = array[i]
  array[i] = array[i + 1]
  array[i + 1] = temp
}
function bubbleSort(array) {
  for (let j = array.length - 1; j > 0; j--) {
    for (let i = 0; i < j; i++) {
      if (array[i] > array[i + 1]) {
        swap(array, i, j)
      }
    }
  }
}

const array = [17, 2, 5, 78, 41]
bubbleSort(array)
console.log(array)
