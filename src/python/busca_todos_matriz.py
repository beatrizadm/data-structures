#passando matriz e valor do elemento como parâmetro
#a funcao retorna uma lista com os pares ordenados de onde o valor e encontrado

def busca_matriz(m, e):
    coordenadas = []
    for i in range(len(m)):
        for j in range(len(m[0])):
            elemento = matriz[i][j]
            if elemento == e:
                coordenada = (i, j)
                coordenadas.append(coordenada)
        

    return coordenadas

