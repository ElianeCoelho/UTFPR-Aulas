public class Carga extends Veiculo implements Calcular{
        int cargaMax;
        int tara;

    public Carga() {
        this.cargaMax = 0;
        this.tara = 0;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    @Override
    public float calcVel(float velocMax) {
        // Calcular a velocidade média em cm/h para veículos de carga
        return velocMax * 100000; // 1 km/h = 100000 cm/h
    }

    @Override
    public int calcular() {
        return 0;
    }
}
