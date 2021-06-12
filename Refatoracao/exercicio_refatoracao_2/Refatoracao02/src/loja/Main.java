package loja;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import loja.Produto;
import loja.Relatorio;

public class Main {

    public static void main(String[] args) {
        boolean clienteVIP = false;
        Produto p1 = new Produto("Arroz", 5, 18.75);
        Produto p2 = new Produto("Feijão", 1, 4.95);
        Produto p3 = new Produto("Leite", 1, 3.49);
        ArrayList<Produto> produtos = new ArrayList();
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        Relatorio relatorio = new Relatorio();
        
        relatorio.somaPrecos(produtos);
        relatorio.taxaEntrega();
        relatorio.aplicarDesconto();
        relatorio.total();
        
    }
}