package view;

import model.Evento;
import model.Palestrante;
import model.Participante;
import model.Sessao;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        Evento evento = new Evento();
        evento.setId(1);
        evento.setNome("Projetos de CTO");
        evento.setDatainicial("13/09/2024");
        evento.setDatafinal("14/09/2024");
        evento.setLocal("Infosevic Telecom");

        Participante participante = new Participante();
        participante.setId(2);
        participante.setNome("Angelo Polli Bernardi");
        participante.setCpf("121.357.499-40");
        participante.setNumero("(46) 999849042");

        Palestrante palestrante = new Palestrante();
        palestrante.setId(3);
        palestrante.setNome("Alessandro Alves");
        palestrante.setEspecialidade("Gerente de Operações e especialista em projetos de fibra optica");

        Sessao sessao = new Sessao();
        sessao.setHorariodasessao("7:00 - 14:00");
        sessao.setNomesessao("Infraestrutura");
        sessao.setPalestrante(palestrante);
        sessao.setParticipante(participante);

        evento.setSessao(sessao);

        JOptionPane.showMessageDialog(null, evento);
    }

}
