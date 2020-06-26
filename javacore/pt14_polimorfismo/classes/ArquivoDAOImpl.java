package maratonajava.javacore.pt14_polimorfismo.classes;

public class ArquivoDAOImpl implements GenericDAO {

    @Override
    public void save() {
        System.out.println("Salvando dados nos arquivos");
    }
}
