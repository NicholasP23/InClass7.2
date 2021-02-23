package io.github.nicholasp23.inclass7_2;

public class ConsoleCommand implements Command{
    @Override
    public void execute(CommandSource source, String[] args) {

        if(source instanceof Player){
            System.out.println("You are a player! This is a console only command!");
            return;
        }
        System.out.println(args[0] + " just died by " + source.getName());
    }

}
