package model;

public class Participante {
    private int id;
    private String nome;
    private String cpf;
    private String numero;

    public Participante() {

    }

    public Participante(int id, String nome, String cpf, String numero) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Participante:\n" +
                "Id:" + id + "\n" +
                "Nome:" + nome + "\n" +
                "Cpf: " + cpf + "\n" +
                "Numero: " + numero;

    }
}



