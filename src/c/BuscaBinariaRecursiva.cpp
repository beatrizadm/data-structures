#include <iostream>
#include <vector>

using namespace std;

int buscaBinariaRecursiva(int vector[], int left, int right, int element){

    int middle = (left + right) / 2;    

    if (left > right)
        return -1;
    
    if (vector[middle] == element)
        return middle;
    
    else if (vector[middle] > element)
        return buscaBinariaRecursiva(vector, left, middle-1, element);
    
    else
        return buscaBinariaRecursiva(vector, middle+1, right, element);   
}

int buscaBinariaRecursiva(int vector[], int sizeVector, int element){    
    return buscaBinariaRecursiva(vector, 0, sizeVector-1, element);
}


int main(){
    int arr[] = { 2, 3, 4, 10, 40 }; 
    int x;
    cout << "Element to be searched in the vector: ";
    cin >> x; 
    
    int size = sizeof(arr) / sizeof(int);
    
    int result = buscaBinariaRecursiva(arr, size, x); 

    (result == -1) ? cout << "Element is not present in array" << endl
                   : cout << "Element is present at index " << result << endl; 
    return 0; 
}
