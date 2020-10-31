#include <iostream>
#include <vector>

using namespace std;

void swap(int vector[], int i, int j){
    int temp = vector[i];
    vector[i] = vector[j];
    vector[j] = temp;
}

void bubbleSort(int vector[], int leftIndex, int rightIndex){
    for (int i = leftIndex; i < rightIndex; i++)
        for (int j = leftIndex; j < rightIndex; j++)
            if (vector[j] > vector[j+1])
                swap(vector, j, j+1);  
}

void bubbleSort(int vector[], int n){
    bubbleSort(vector, 0, n-1);
}

void printArray(int arr[], int n){  
    cout << "[";
    int i;
    for (i = 0; i < n; i++)  
        if (i == n-1)
            cout << arr[i];  
        else
            cout << arr[i] << " ";  
    cout << "]" << endl;  
}

int main(){
    int array[] = {64, 34, 25, 12, 22, 11, 90};
    int n = sizeof(array) / sizeof(int);
    
    cout << "Array antes do sort: ";
    printArray(array, n);

    bubbleSort(array, n);
    cout << "Array depois do sort: ";
    printArray(array, n);
}
