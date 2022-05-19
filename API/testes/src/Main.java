import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        minhaLista.add(new ListaCompras(0,"sabao0",5,3));
        minhaLista.add(new ListaCompras(1,"sabao1",8,2));
        System.out.println("Hello world!");

        System.out.println(visualizar());
        System.out.println("Digite o nome do produto: ");
        String nome = sc.nextLine();
        System.out.println("Digite a quantidade de produtos: ");
        int quant = sc.nextInt();
        System.out.println("Digite o preço unitario do produto: ");
        double preco = sc.nextDouble();

        minhaLista.add(new ListaCompras(2,nome,quant,preco));
        System.out.println(visualizar());
        System.out.println("Qual ID da lista que deseja apagar? ");
        int idDelete = sc.nextInt();
        deletar(idDelete);
        System.out.println(visualizar());
    }
    public static List<ListaCompras> minhaLista = new ArrayList<ListaCompras>();

    public static List<ListaCompras> visualizar(){
        return minhaLista;
    }

    public static void inserir(ListaCompras compra){
        minhaLista.add(compra);
    }

    public static void deletar(int id){
        minhaLista.remove(minhaLista.get(id));
    }
}