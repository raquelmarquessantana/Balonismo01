public class pessoa {

    //Atributos
    private String nome;
    private int CPF;
    private int RG;
    private float Telefone;
    private float Telefone_cont;
    private String Endereço;

    public pessoa(String nome, int CPF, int RG, int telefone, int telefone_cont, String endereço) {
        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;
        Telefone = telefone;
        Telefone_cont = telefone_cont;
        Endereço = endereço;
    }

    public pessoa(String raquel, String CPF, int rg, float telefone, float telefone_cont, String endereco) {

    }

    public String getNome() {
        return nome;
    }
     public void setNome(String nome){
        this.nome = nome;
     }

    public String getCPF(){
        return getCPF();
    }
    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public float getTelefone() {
        return Telefone;
    }

    public void setTelefone(int telefone) {
        Telefone = telefone;
    }

    public float getTelefone_cont() {
        return Telefone_cont;
    }

    public void setTelefone_cont(int telefone_cont) {
        Telefone_cont = telefone_cont;
    }

    public String getEndereço() {
        return Endereço;
    }

    public void setEndereço(String endereço) {
        Endereço = endereço;
    }

    //Métodos
    public void voa() {System.out.println("Pessoa Viaja"); }

    public void voa(String pessoa_viaja) {
    }

}
