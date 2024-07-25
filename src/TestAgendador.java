import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAgendador {
    Agendador agendador;
    
    @Before
    public void setUp() throws Exception {
        agendador = new Agendador();
    }
    
    @Test
    public void addEventoTest() {
        String nome = "Evento de Teste";
        String eventoInicio = "2024-07-24 15:00";
        String eventoFim = "2024-07-24 16:00";
        Evento evento = agendador.adicionarEvento(nome, eventoInicio, eventoFim);
        assertEquals((new Evento(nome, eventoInicio, eventoFim)).toString(), evento.toString());
    }
    @Test
    public void failAddEventoTest() {
        addEventoTest();

        String nome = "Evento de Teste2";
        String eventoInicio = "2024-07-24 15:00";
        String eventoFim = "2024-07-24 16:00";
        Evento evento = agendador.adicionarEvento(nome, eventoInicio, eventoFim);
        assertEquals(null, evento);
    }


    @Test
    public void removeEventoTest() {
        String nome = "Evento de Teste Remoção";
        String eventoInicio = "2024-07-24 15:00";
        String eventoFim = "2024-07-24 16:00";
        agendador.adicionarEvento(nome, eventoInicio, eventoFim);
        Evento eventoRemovido = agendador.removerEvento(nome);
        assertEquals((new Evento(nome, eventoInicio, eventoFim)).toString(), eventoRemovido.toString());
    }

    @Test
    public void showAgendadorTest() {
        String retorno = agendador.mostrarEventos();
        assertEquals("Nenhum evento agendado.",retorno);
        addEventoTest();
        assertEquals("Evento de Teste: 2024-07-24 15:00 a 2024-07-24 16:00", agendador.mostrarEventos());
    }
}
