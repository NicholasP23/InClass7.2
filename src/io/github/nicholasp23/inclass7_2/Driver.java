package io.github.nicholasp23.inclass7_2;

public class Driver {

    private static final Command[] command = new Command[2];

    public static void main(String[] args){
        String[] players = {"player1"};
        Player player = new Player("nick", 1,2,3,false);
        Console console = new Console();

        command[0] = new PlayerCommand();
        command[1] = new ConsoleCommand();


        runCommand(command[0], player, players); // literally just confirms the player sending a message to another player
        runCommand(command[1], console, players); // console just killing a player

    }

    public static String getCommands(){
        return "PlayerCommand, ConsoleCommand";
    }

    private static void runCommand(Command run, CommandSource src, String[] args){
        run.execute(src, args);
        System.out.println("\n");
    }
}

