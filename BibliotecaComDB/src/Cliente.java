import java.sql.Timestamp;


public class Cliente {
    private String nome;
    private Timestamp data_nasc;
    private  String sexo;
    private int cpf;
    private String endereco;
    private int fone;


    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente(String nome, Timestamp data_nasc, String sexo, int cpf, String endereco, int fone) {
        this.nome = nome;
        this.data_nasc = data_nasc;
        this.sexo = sexo;
        this.cpf = cpf;
        this.endereco = endereco;
        this.fone = fone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Timestamp getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(Timestamp data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getFone() {
        return fone;
    }

    public void setFone(int fone) {
        this.fone = fone;
    }

}
