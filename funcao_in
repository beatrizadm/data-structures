#vai definir se um elemento esta ou nao em uma string

def funcao_in(string, elemento):
  for i in range(len(string)-len(elemento)+1):
    if elemento == get_str(string,i,i+len(elemento)):
      return True
  return False
  
def get_str(string,i,f):
  nome = ""
  for c in range(i,f):
    nome += string[c]
  return nome
