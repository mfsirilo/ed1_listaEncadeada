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
        //quando na posicao desejada
        
        
        
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
