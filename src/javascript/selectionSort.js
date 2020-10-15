
function selectionSort(array) {
    let size = array.length;
    for (let i = 0; i < size; i++) {
        let min = i;
        for (let j = i + 1; j < size; j++) {
            if (array[min] > array[j]) {
                min = j;
            }
        }
        if (min !== i) {
            let tmp = array[i];
            array[i] = array[min];
            array[min] = tmp;
        }
    }
    return array;
}

let array = [10,8,3,4,15,42]
selectionSort(array)
console.log(array)