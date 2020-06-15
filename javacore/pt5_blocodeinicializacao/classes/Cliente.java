package maratonajava.javacore.pt5_blocodeinicializacao.classes;

public class Cliente {
    /*
O caminho da compilação até chegar ao construtor
    1 - Alocado espaço na memoria para o objetto que será criado
    2 - Cada atributo de classe é criado e inicializado com seus valores default ou valores explicitos
    3 - Bloco de inicialização é executado
    4 - O construtor é executado
     */
    private int[] parcelas;

    {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicialização");
        for (int i=1; i<=100; i++){
            parcelas[i-1] = i;// ??
        }
    }
    public Cliente() {
        System.out.println("Dentro do construtor");
        for (int parcela : this.parcelas) {
            System.out.println(parcela + " ");
        }
    }

        public int[] getParcelas () {
        return parcelas;
    }

        public void setParcelas ( int[] parcelas){
        this.parcelas = parcelas;

        System.out.println("dentro do bloco de inicialização");
    }
}
