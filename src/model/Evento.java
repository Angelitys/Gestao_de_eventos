package model;

public class Evento {
    private int id;
    private String nome;
    private String datainicial;
    private String datafinal;
    private String local;
    private Sessao sessao;

    public Evento() {

    }

    public Evento(int id, String nome, String datainicial, String datafinal, String local, Sessao sessao) {
        this.id = id;
        this.nome = nome;
        this.datainicial = datainicial;
        this.datafinal = datafinal;
        this.local = local;
        this.sessao = sessao;
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

    public String getDatainicial() {
        return datainicial;
    }

    public void setDatainicial(String datainicial) {
        this.datainicial = datainicial;
    }

    public String getDatafinal() {
        return datafinal;
    }

    public void setDatafinal(String datafinal) {
        this.datafinal = datafinal;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }


    @Override
    public String toString() {
        return "EVENTO\n" +
                "Id: " + id + "\n" +
                "Sessao: " + sessao+ "\n" +
                "Nome: " + nome+ "\n" +
                "Local: " + local+ "\n"+ "\n" +
                "Datainicial: " + datainicial+ "\n" +
                "DataFinal: " + datafinal+ "\n";




    }
}
