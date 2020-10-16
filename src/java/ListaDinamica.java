//importando bibliotecas
import java.util.Scanner;

public class ListaDinamica {

    //Inicializando um Scanner global
    public static Scanner sc = new Scanner(System.in);
    public static void main(String [] args) throws Exception{

        Lista lista = new Lista();

        lista.inserirFim(3);
        lista.inserirInicio(0);
        lista.inserir(1, 1);
        lista.inserir(2, 2);
        lista.inserirFim(5);

        lista.mostrar();

        // removendo o elemento da posição 4
        lista.remover(4);

        lista.mostrar();

    }

}

    class Celula {

        public int elemento; // Elemento inserido na celula.
        public Celula prox; // Aponta a celula prox.
        
        public Celula(){
            this(0);
        }
    
        public Celula(int elemento) {
          this.elemento = elemento;
          this.prox = null;
        }
    }

    class Lista {

        private Celula primeiro;
        private Celula ultimo;
    
    
        /*
         * Construtor da classe que cria uma lista sem elementos (somente no cabeca).
         */
        public Lista() {
            primeiro = new Celula();
            ultimo = primeiro;
        }
    
    
        /**
        * Insere um elemento na primeira posicao da lista.
        * @param x int elemento a ser inserido.
        */
        public void inserirInicio(int x) {
            Celula tmp = new Celula(x);
            tmp.prox = primeiro.prox;
            primeiro.prox = tmp;
            if (primeiro == ultimo) {                 
                ultimo = tmp;
            }
          tmp = null;
        }
    

        public void inserirFim(int x) {
            ultimo.prox = new Celula(x);
            ultimo = ultimo.prox;
        }
    

        public int removerInicio() throws Exception {

            if (primeiro == ultimo) {
                throw new Exception("Erro ao remover (vazia)!");
            }
    
            Celula tmp = primeiro;
            primeiro = primeiro.prox;
            int resp = primeiro.elemento;
            tmp.prox = null;
            tmp = null;

            return resp;
        }
    

        public int removerFim() throws Exception {

            if (primeiro == ultimo) {
                throw new Exception("Erro ao remover (vazia)!");
            } 
    
            Celula i;
            for(i = primeiro; i.prox != ultimo; i = i.prox);
        
            int resp = ultimo.elemento; 
            ultimo = i; 
            i = ultimo.prox = null;
          
            return resp;
        }
    
       public void inserir(int x, int pos) throws Exception {
    
          int tamanho = tamanho();
    
          if(pos < 0 || pos > tamanho){
                throw new Exception("Erro ao inserir posicao (" + pos + " / tamanho = " + tamanho + ") invalida!");
          } else if (pos == 0){
             inserirInicio(x);
          } else if (pos == tamanho){
             inserirFim(x);
          } else {
               // Caminhar ate a posicao anterior a insercao
             Celula i = primeiro;
             for(int j = 0; j < pos; j++, i = i.prox);
            
             Celula tmp = new Celula(x);
             tmp.prox = i.prox;
             i.prox = tmp;
             tmp = i = null;
          }
       }
    
        public int remover(int pos) throws Exception {

          int resp;
          int tamanho = tamanho();
    
            if (primeiro == ultimo){
                throw new Exception("Erro ao remover (vazia)!");
    
          } else if(pos < 0 || pos >= tamanho){
                throw new Exception("Erro ao remover (posicao " + pos + " / " + tamanho + " invalida!");
          } else if (pos == 0){
             resp = removerInicio();
          } else if (pos == tamanho - 1){
             resp = removerFim();
          } else {
             Celula i = primeiro;
             for(int j = 0; j < pos; j++, i = i.prox);
            
             Celula tmp = i.prox;
             resp = tmp.elemento;
             i.prox = tmp.prox;
             tmp.prox = null;
             i = tmp = null;
          }
    
            return resp;
        }
    
        public void mostrar() {

            int posicao = 0;

            for (Celula i = primeiro.prox; i != null; i = i.prox) {

                System.out.print("[" +posicao+ "]" + i.elemento + " ");
                posicao++;
            }

            System.out.println();
        }
    
       public int tamanho() {
          int tamanho = 0; 
          for(Celula i = primeiro; i != ultimo; i = i.prox, tamanho++);
          return tamanho;
       }

    }