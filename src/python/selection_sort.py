'''
Implementação do Selection Sort em Python3
'''

def menor(lista, inicio):
    m = inicio #Assumimos o primeiro elemento da lista como sendo o menor
    for i in range(inicio, len(lista)): #Iterando...
        if lista[m] > lista[i]: #Se o elemento atual for menor que o que assumimos como menor...
            m = i #Este é o novo menor elemento
    return m #Retorna o indice do menor elemento


def selection_sort(lista):
    for i in range(len(lista)): #Iterando a lista e levando os menores para o começo
        m = menor(lista, i) #Encontra o menor elemento da lista partindo do ponto não ordenado
        if lista[m] < lista[i]: #Se o menor elemento for menor que o primeiro não ordenado...
            lista[m], lista[i] = lista[i], lista[m] #Trocamos de lugar
