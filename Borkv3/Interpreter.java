
package edu.umw.stephen.bork;

import java.util.Scanner;


public class Interpreter {

    private static GameState state; // not strictly necessary; GameState is 
                                    // singleton

    public static String USAGE_MSG = 
        "Usage: Interpreter borkFile.bork|saveFile.sav.";

    public static void main(String args[]) {

        String command;
        Scanner commandLine = new Scanner(System.in);
        
        System.out.println("What adventure file would you like to play?");
        System.out.print("> ");
        String filename = commandLine.nextLine();

        try {
            state = GameState.instance();
            
            if (filename.endsWith(".bork")) {
                state.initialize(new Dungeon(filename));
                System.out.println("\nWelcome to " + 
                    state.getDungeon().getName() + "!");
            } else if (filename.endsWith(".sav")) {
                state.restore(filename);
                System.out.println("\nWelcome back to " + 
                    state.getDungeon().getName() + "!");
            } else {
                System.err.println(USAGE_MSG);
                System.exit(2);
            }

            System.out.print("\n" + 
                state.getAdventurersCurrentRoom().describe() + "\n");

            command = promptUser(commandLine);

            while (!command.equals("q")) {

                System.out.print(
                    CommandFactory.instance().parse(command).execute());

                command = promptUser(commandLine);
            }

            System.out.println("Bye!");

        } catch(Exception e) { 
            e.printStackTrace(); 
        }
    }

    private static String promptUser(Scanner commandLine) {

        System.out.print("> ");
        return commandLine.nextLine();
    }

}
