package io.github.nicholasp23.inclass7_2;

public class PlayerCommand implements Command{
    @Override
    public void execute(CommandSource src, String[] args) {
        if(src instanceof Console){
            System.out.println("You are not a player! This is a player only command!");
            return;
        }

        System.out.println(src.getName() +  " sending message to  " + args[0]);
    }
}
