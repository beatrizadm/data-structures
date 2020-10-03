import random

def quickSort(array, leftIndex, rightIndex):
    if (leftIndex >= rightIndex): return
    #Coloca a mediana no inicio do array.
    med = mediana(array, leftIndex, rightIndex-1)
    array[leftIndex], array[med] = array[med], array[leftIndex]
    
    #Define o pivot como primeiro elemento.
    pivot = array[leftIndex]
    
    #i, é o valor que define o próximo valor do array a ser trocado -1.
    i = leftIndex
    
    #loop que varre o array procurando os valores menores que o pivot e trocando com o i.
    for j in range(i+1, rightIndex):
        if (array[j] < pivot):
            i += 1
            array[i], array[j] = array[j], array[i]
    #por fim, troca o i com o pivot, a fim de deixar todos os menores que o pivot na esquerda, e os maiores a direita.
    array[i], array[leftIndex] = array[leftIndex], array[i]
    
    #Executa a mesma ação de forma recursiva até que só sobre um elemento no array.
    quickSort(array, leftIndex, i)
    quickSort(array, i+1, rightIndex)
    
def mediana(array, ini, fim):
    a = array[ini];
    b = array[int((ini+fim)/2)];
    c = array[fim];
    if (a < b):
        if (b < c):
            return int((ini+fim)/2);
        else:
            if (a < c) :
                return fim;
            else:
                return ini;
    else:
        if (c < b):
            return int((ini+fim)/2);
        else:
            if (c < a):
                return fim;
            else:
                return ini;

tentativas = 0
#Test
while True:	
    h = random.sample(range(0,100),100)
    ordenada_certa = sorted(h)
    quickSort(h, 0, len(h))
    if ordenada_certa != h:
	    print (h)
	    break
    else:
        tentativas += 1
        print ("Arrays ordenados com sucesso: "+str(tentativas))