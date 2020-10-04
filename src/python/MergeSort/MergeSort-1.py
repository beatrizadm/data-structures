import random

# DIVIDE A LISTA EM DUAS PARA O MERGE SORT
def separador(lista):
	l1 = []
	l2 = []
	for i in range(0,len(lista)/2): 
		l1.append(lista[i])
	for i in range(len(lista)/2,len(lista)): 
		l2.append(lista[i])
	return l1,l2
	
# MERGE JUNTA LISTA
def juntalista(lista1,lista2):
	novalista = []
	while len(lista1) != 0 and len(lista2) != 0:
		if lista1[0] >= lista2[0]: 
			novalista.append(lista2.pop(0))
		else: 
			novalista.append(lista1.pop(0))
	if len(lista1) != 0:
		for e in lista1: 
			novalista.append(e)
	elif len(lista2) != 0:
		for e in lista2: 
			novalista.append(e)
	return novalista
	
# SORT
def merge(lista):
	# CASOS DE PARADA
	if len(lista) < 2: return lista
	# RECURSIVIDADE
	else:
		lis1,lis2 = separador(lista)
		return juntalista(merge(lis1),merge(lis2))

#Teste
while True:	
	h = random.sample(range(0,100),100)
	if sorted(h) != merge(h):
		print h
		break

