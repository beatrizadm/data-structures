

function insertionSort(array) {
    let size = array.length;
        for (let i = 1; i < size; i++) {
            let atual = array[i];
            let j = i-1; 
            while ((j > -1) && (atual < array[j])) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = atual;
        }
    return array;
}

