import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agendador agendador = new Agendador();
        while (true){
            System.out.println("Digite uma ação (adicionar, remover, mostrar, sair): ");
            String response = scanner.nextLine();
            switch (response){
                case "adicionar":
                    System.out.println("Digite o nome do evento: ");
                    String nomeAdicionar = scanner.nextLine();
                    System.out.println("Digite a hora de inicio do evento (YYYY-MM-DD HH:MM): ");
                    String horaInicio = scanner.nextLine();
                    System.out.println("Digite a hora de termino do evento (YYYY-MM-DD HH:MM): ");
                    String horaFim = scanner.nextLine();
                    agendador.adicionarEvento(nomeAdicionar, horaInicio, horaFim);
                    break;
                case "remover":
                    System.out.println("Digite o nome do evento: ");
                    String nomeRemover = scanner.nextLine();
                    agendador.removerEvento(nomeRemover);
                    break;
                case "mostrar":
                    System.out.println(agendador.mostrarEventos());
                    System.out.println();
                    break;
                case "sair":
                    return;
                default:
                    System.out.println("Ação inválida");
                    System.out.println();
                    break;
            }
        }
    }
}
