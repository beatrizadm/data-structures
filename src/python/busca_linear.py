def busca_linear(array, elemento):
    for i in range(len(array)):
        if (array[i] == elemento):
            return i
    return -1

