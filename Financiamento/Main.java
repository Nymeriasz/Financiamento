package Financiamento;

public class Main {
    public static void main(String[] args) {
        try {
            Financiamento f = new Financiamento(1000, 200, 2);
            System.out.println("Prestação: "+f.prestacao());
        }catch (RuntimeException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
