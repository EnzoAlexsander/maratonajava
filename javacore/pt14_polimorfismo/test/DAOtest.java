package maratonajava.javacore.pt14_polimorfismo.test;

import maratonajava.javacore.pt14_polimorfismo.classes.ArquivoDAOImpl;
import maratonajava.javacore.pt14_polimorfismo.classes.GenericDAO;

import java.util.ArrayList;
import java.util.List;

public class DAOtest {
    public static void main(String[] args) {
        GenericDAO arquivoDAO = new ArquivoDAOImpl();
        arquivoDAO.save();
        List<String> lista = new ArrayList<>();
        lista.add("Nome1");
        lista.add("Nome2");
        lista.add("Nome3");
        lista.add("Nome4");
        for(String nome : lista){
            System.out.println(nome);
        }
    }
}
