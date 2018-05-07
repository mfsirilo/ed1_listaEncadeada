package listaencadeada;

public class ListaEncadeada {

    private No primeiro;
    private No ultimo;
    private int totalDeElementos;

    public void Adiciona(Object elemento) {
        No no = new No(elemento);
        if (primeiro == null && ultimo == null) {
            no.setProximo(null);
            primeiro = no;
            ultimo = no;
        } else {
            no.setProximo(primeiro);
            primeiro = no;
        }
        this.totalDeElementos++;
    }

    public void Adiciona(int posicao, Object elemento) {
        No no = new No(elemento);
        No noAux = this.primeiro;
        if (primeiro == null && ultimo == null) {
            no.setProximo(null);
            primeiro = no;
            ultimo = no;
        } else if (posicao > this.Tamanho()) {
            this.ultimo.setProximo(no);
            ultimo = no;
            System.out.println("Você informou uma posição inexistente "
                    + "O elemento foi insediro no final da lista.");
        } else {
            for (int i = 0; i == posicao - 1; i++) {
                noAux = noAux.getProximo();
            }
            no.setProximo(noAux.getProximo());
            noAux.setProximo(no);
        }
        this.totalDeElementos++;
    }

    public void AdicionaNoComeco(Object elemento) {
        No no = new No(elemento);

        if (Tamanho() != 0) {
            no.setProximo(primeiro);
            primeiro = no;
        } else {
            primeiro = no;
        }

        this.totalDeElementos++;

    }

    public int Tamanho() {
        return totalDeElementos;
    }

    public boolean Contem(Object elemento) {
        No noAux = this.primeiro;

        for (int i = 0; i <= this.totalDeElementos; i++) {
            if (elemento == noAux.getElemento()) {
                return true;
            }
            noAux = noAux.getProximo();
        }

        return false;
    }

    public void Remove(int posicao) {

        No noAux = this.primeiro;

        if (posicao > this.Tamanho()) {
            System.out.println("Você informou uma posição inexistente");
        } else {
            for (int i = 1; i <= posicao - 1; i++) {
                noAux = noAux.getProximo();
            }
            noAux.setProximo(noAux.getProximo().getProximo());
        }
        this.totalDeElementos--;
    }

    public void RemoveDoComeco() {
        No no = this.primeiro;
        no = primeiro.getProximo();
        this.totalDeElementos--;
    }

    public void RemoveDoFim(Object elemento) {
        Remove(Tamanho());
    }

}
