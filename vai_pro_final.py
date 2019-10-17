def vai_pro_final(lista, indice): 
    while indice != len(lista) -1:
        lista[indice],lista[indice + 1] = lista[indice + 1],lista[indice]
        indice += 1
    return lista
