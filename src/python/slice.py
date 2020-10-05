'''
Implementação de função de slice em Python3.
A função recebe uma lista, a posição inicial 
e a final do corte e retorna uma nova lista 
com os elementos do intervalo passado. 

Caso não sejam passados, os parâmetros pos_i é tido
como 0 por default e o pos_f é tido como o tamanho da
lista de origem.  
'''
def slice(array, pos_i=0, pos_f=None):
    
    if pos_f is None or pos_f >= len(array): #Para casos nos quais a posição final não é passada ou é maior que o tamanho da lista
        pos_f = len(array)
    elif pos_f < 0: #Para casos nos quais a posição final é negativa
        pos_f = len(array) + pos_f

    if pos_i < 0: #Para casos nos quais a posição inicial é negativa
        pos_i = len(array) + pos_i
    
    #Nova lista a ser retornada
    new_array = list()

    #Iterando no intervalo [pos_i, pos_f[ da lista
    for i in range(pos_i, pos_f):
        new_array.append(array[i])

    return new_array
