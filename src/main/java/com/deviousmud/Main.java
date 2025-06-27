package com.deviousmud;

public class Main {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please specify 'server' or 'client' as argument.");
            return;
        }

        switch (args[0].toLowerCase()) {
            case "server":
                runServer();
                break;
            case "client":
                runClient();
                break;
            default:
                System.out.println("Unknown action: " + args[0]);
                System.out.println("Usage: java -cp target/classes com.deviousmud.Main server|client");
        }
    }

    private static void runServer() {
        System.out.println("🟢 Starting DeviousMUD Server...");
        // Placeholder logic
        System.out.println("Server initialized on port 43594 (placeholder).");
        // TODO: Add socket listener and game loop
    }

    private static void runClient() {
        System.out.println("🔵 Starting DeviousMUD Client...");
        // Placeholder logic
        System.out.println("Connecting to localhost:43594 (placeholder).");
        // TODO: Add client networking and rendering
    }
}
