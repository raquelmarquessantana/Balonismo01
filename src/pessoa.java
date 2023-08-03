public class pessoa {

    //Atributos
    String nome;
    String CPF;
    int RG;
    int Telefone;
    int Telefone_cont;
    String Endereço;

    public pessoa(String nome, String  CPF, int RG, int telefone, int telefone_cont, String endereço) {
        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;
        Telefone = telefone;
        Telefone_cont = telefone_cont;
        Endereço = endereço;
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
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int telefone) {
        Telefone = telefone;
    }

    public int getTelefone_cont() {
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
