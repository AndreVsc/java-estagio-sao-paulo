package andrevsc.quests;

public class Faturamento {
    private int dia;
    private double valor;
    
    public Faturamento(int dia, double valor) {
        this.dia = dia;
        this.valor = valor;
    }
    public int getDia() {
        return dia;
    }
    public double getValor() {
        return valor;
    }
}
