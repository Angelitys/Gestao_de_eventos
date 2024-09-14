package model;

public class Sessao {
    private String horariodasessao;
    private String nomesessao;
    private Participante participante;
    private Palestrante palestrante;

    public Sessao() {

    }

    public Sessao(String horariodasessao, String nomesessao, Participante participante, Palestrante palestrante) {
        this.horariodasessao = horariodasessao;
        this.nomesessao = nomesessao;
        this.participante = participante;
        this.palestrante = palestrante;
    }

    public String getHorariodasessao() {
        return horariodasessao;
    }

    public void setHorariodasessao(String horariodasessao) {
        this.horariodasessao = horariodasessao;
    }

    public String getNomesessao() {
        return nomesessao;
    }

    public void setNomesessao(String nomesessao) {
        this.nomesessao = nomesessao;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public Palestrante getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(Palestrante palestrante) {
        this.palestrante = palestrante;
    }

    @Override
    public String toString() {
        return "Sessao:" +
                "Palestrante "+palestrante+" \n" +
                "Horario da Sessão: "+ horariodasessao+" \n" +
                "Nome da Sessão: " + nomesessao+" \n" +
                "Participante: "+ participante+" \n" +
                "Palestrante: "+ palestrante;

    }
}
