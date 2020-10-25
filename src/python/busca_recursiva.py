def busca_linear_recursiva(array,elemento):
    i = -1
    return busca_recursiva(array,elemento, i)

def busca_recursiva(array,elemento, i):
    i += 1
    if(i == len(array)):
       return -1
    if(array[i] == elemento):
        return i
    return busca_recursiva(array,elemento,i)
