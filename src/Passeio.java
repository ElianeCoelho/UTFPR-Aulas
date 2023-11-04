public class Passeio extends Veiculo implements Calcular{
    int qtdPassageiros;

    public Passeio() {
        this.qtdPassageiros = 0;
    }

    public int getQtdPassageiros(){return qtdPassageiros;}
    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    @Override
   public float calcVel(float velocMax) {
        // Calcular a velocidade média em m/h para veículos de passeio
        return velocMax * 1000; // 1 km/h = 1000 m/h
    }

    @Override
    public int calcular() {
        return 0;
    }
}
