package maratonajava.javacore.pt08_heranca.test;

import maratonajava.javacore.pt08_heranca.classes.Endereco;
import maratonajava.javacore.pt08_heranca.classes.Funcionario;

/*
1- Espaço em memória é alocado para o objeto sendo construído;
2- Cada um dos atributos do objeto é criado e inicializado com os valores default;
3- O construtor da superclasse é chamado;
4- A inicialização dos atributos via declaração e o código do bloco de inicialização
da superclasse são executados na ordem em que aparecem;
5- O código do construtor da superclasse é chamado;
6- Passo 4 para a subclasse é executado;
7- O código do construtor da classe é executado.
 */
public class HerancaTest {
    public static void main(String[] args) {
//        Pessoa p = new Pessoa("Enzo");
        Endereco end = new Endereco();

//        p.setCpf("111.222.333-44");

//        end.setBairro("Psul");
        end.setRua("Conjunto D");

//        p.setEndereco(end);
        //p.imprime();

        System.out.println("------------------------------------------------");
        Funcionario f = new Funcionario("Messi");
        f.setCpf("101.010.101-01");
        f.setSalario(200.0);
        f.setEndereco(end);
        //f.imprime();
    }
}
