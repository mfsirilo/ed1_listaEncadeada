package listaencadeada;

public class ListaEncadeada {

    private No primeiro;
    private No ultimo;
    private int totalDeElementos;

    public void adiciona(Object elemento) {
        No no = new No(elemento);
        if(primeiro==null && ultimo==null){
            no.setProximo(null);
            primeiro = no;
            ultimo = no;
        }else{
            no.setProximo(primeiro);
            primeiro = no;
        }
        this.totalDeElementos++;
    }

    public void adiciona(int posicao, Object elemento) {
        No no = new No(elemento);
        No noAux = this.primeiro;
        if(posicao>this.tamanho()){
            this.ultimo.setProximo(no);
            ultimo = no;
            System.out.println("Você informou uma posição maior que o "
                    + "número de elementos na lista.\n"
                    + "O elemento foi insediro no final da lista.");
        }else{
            //Para percorrer até a posição desejada
            for(int i = 0; i==posicao-1;i++){
                noAux = noAux.getProximo();
            }
            //quando na posicao desejada
            no.setProximo(noAux.getProximo());
            noAux.setProximo(no);
        }
    }

    public void remove(int posicao) {
        
    }

    public int tamanho() { 
        return totalDeElementos;
    }

    public boolean contem(Object o) {
        return false;
    }

    public void adicionaNoComeco(Object elemento) {

    }

    public void removeDoComeco() {

    }

    public void removeDoFim() {

    }

   

}
