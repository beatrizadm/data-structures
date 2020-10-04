def transposta(matriz):
    
    transposta = []
    for j in range(len(matriz[0])):
        linha = []
        for i in range(len(matriz)):
            linha.append(matriz[i][j])

        transposta.append(linha)

    return transposta

