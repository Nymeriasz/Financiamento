package Financiamento;

public class Financiamento {
    private double valorTotal;
    private double entrada;
    private int parcelas;

    public Financiamento(double valorTotal, double entrada, int parcelas){
        if (entrada<valorTotal*0.2){
            throw new RuntimeException("Valor de entrada menor que 20% do valor total.");
        } else if (parcelas>4) {
            throw new RuntimeException("Número máximo de parcelas deve ser 4.");
        } else {
            this.valorTotal=valorTotal;
            this.entrada=entrada;
            this.parcelas=parcelas;
        }
    }

    public double prestacao(){
        return (valorTotal-entrada)/parcelas;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public double getEntrada() {
        return entrada;
    }
    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }
    public int getParcelas() {
        return parcelas;
    }
    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }
}
