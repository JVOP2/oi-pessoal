import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ChatMediator chatRoom = new ChatRoom();

        // Criando usuários
        User ana = new ChatUser(chatRoom, "Ana");
        User bruno = new ChatUser(chatRoom, "Bruno");
        User carla = new ChatUser(chatRoom, "Carla");

        // Adicionando usuários ao chat
        chatRoom.addUser(ana);
        chatRoom.addUser(bruno);
        chatRoom.addUser(carla);

        System.out.println("=== Sistema de Chat ===");
        System.out.println("Digite 'c' para Carla enviar 'Oi, pessoal!'");
        System.out.println("Digite 'a' para Ana enviar 'Oi, Carla!'");
        System.out.println("Digite 'sair' para encerrar.\n");

        while (true) {
            System.out.print("Comando: ");
            String comando = scanner.nextLine();

            if (comando.equalsIgnoreCase("sair")) {
                System.out.println("Encerrando chat...");
                break;
            } else if (comando.equalsIgnoreCase("c")) {
                carla.send("Oi, pessoal!");
            } else if (comando.equalsIgnoreCase("a")) {
                ana.send("Oi, Carla!");
            } else {
                System.out.println("⚠️ Comando não reconhecido!");
            }
            System.out.println();
        }

        scanner.close();
    }
}
