package io.github.nicholasp23.inclass7_2;

public class Console implements CommandSource{

     public void consoleMessage(){
         System.out.println("You have messaged the console!");
     }

    @Override
    public String getName() {
        return "console";
    }

    @Override
    public void sendMessage(String x) {
        System.out.println(x);
    }

    @Override
    public boolean isOperator() {
        return false;
    }
}
