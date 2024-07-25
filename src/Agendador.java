import java.util.ArrayList;

public class Agendador {
    private ArrayList<Evento> eventos = new ArrayList<>();

    public Evento adicionarEvento(String nome, String eventoInicio, String eventoFim){
        for (Evento e : eventos){
            if (e.getHoraInicio().equals(eventoInicio)){
                System.out.println("Falha ao adicionar evento\n");
                return null;
            }
        }
        eventos.add(new Evento(nome, eventoInicio, eventoFim));
        System.out.println("Evento adicionado com sucesso!\n");
        return eventos.getLast();
    }

    public Evento removerEvento(String nome){
        Evento retorno = null;
        for (Evento e : eventos){
            if (e.getNome().equals(nome)){
                retorno = e;
                break;
            }
        }
        if (retorno == null){
            System.out.println("Evento não encontrado!\n");
        }else {
            eventos.remove(retorno);
            System.out.println("Evento removido com sucesso.\n");
        }
        return retorno;
    }

    public String mostrarEventos(){
        String retorno = "";
        for (Evento e : eventos){
            if (e == eventos.getLast()){
                retorno += e.toString();
            }else {
                retorno += e.toString() + "\n";
            }
        }
        if (retorno.isEmpty()){
            return "Nenhum evento agendado.";
        }
        return retorno;
    }
}
