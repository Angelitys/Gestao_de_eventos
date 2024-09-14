package model;

public class Palestrante {
    private int id;
    private String nome;
    private String especialidade;

    public Palestrante() {

    }

    public Palestrante(int id, String nome, String especialidade) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
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

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Palestrante:\n" +
                "Id:"+id+"\n" +
                "Nome:"+nome+"\n" +
                "Especialidade: " + especialidade;
    }
}
