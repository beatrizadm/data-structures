import random

#Insertion sort obs: funcao com efeito colateral.
def ordenador_insertion(v):
	for i in range(1,len(v)):
		j = i
		while j > 0 and v[j] < v[j-1]:
			temp = v[j]
			v[j] = v[j-1]
			v[j-1] = temp
			j -= 1
	
#Test	
while True:	
	h = random.sample(range(0,100),100)
	ordenada_certa = sorted(h)
	ordenador_insertion(h)
	if ordenada_certa != h:
		print h
		break

