package listaencadeada;

import java.util.*;

public class ClasseExecutiva {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tamanho;
        System.out.println("Informe o tamanho do teste");
        tamanho = scan.nextInt();
        scan.nextLine();

//         Object elemento = null;
//         No no = new No(elemento);
        ListaEncadeada lista1 = new ListaEncadeada();

        for (int i = 0; i < tamanho; i++) {
            lista1.Adiciona(i + 1);
        }
        System.out.println("imprime lista");
        
        lista1.ImprimeLista();
        
        if (lista1.Contem(lista1.Tamanho())) {
            System.out.println("TUUUUUUUUDOK");
        }
        
        for (int i = 0; i < 10; i++) {
            lista1.Remove(i);
        }
        System.out.println("imprime lista depois de remover");
        lista1.ImprimeLista();


    }

}
