public class balao {

    //atributos
    private int id;
    private String cor;
    private String tipo;
    private double altura;
    private double peso;
    private String porte;
    private int capacidadedePessoa;

    public balao(){}

    public balao(int id, String cor, String tipo, double altura, double peso, String porte, int capacidadedePessoa) {
        this.id = id;
        this.cor = cor;
        this.tipo = tipo;
        this.altura = altura;
        this.peso = peso;
        this.porte = porte;
        this.capacidadedePessoa = capacidadedePessoa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public int getCapacidadedePessoa() {
        return capacidadedePessoa;
    }

    public void setCapacidadedePessoa(int capacidadedePessoa) {
        this.capacidadedePessoa = capacidadedePessoa;
    }
}

