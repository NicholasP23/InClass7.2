package io.github.nicholasp23.inclass7_2;

public interface Command{
    default void execute(CommandSource src, String[] args){
        System.out.println("Commands available for players and console: " + Driver.getCommands() );
    }
}
