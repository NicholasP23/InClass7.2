package io.github.nicholasp23.inclass7_2;

public class Player implements CommandSource {

    private String name;
    private int x,y,z;
    private final boolean operator;


    Player(String name, int x, int y, int z, boolean operator){
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
        this.operator = operator;
    }

    public String getLocation(){
        return "x: " + x + "\ny: " + y + "\nz:" + z;
    }

    public void setLocation(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void sendMessage(String x) {
        System.out.println(x);
    }

    @Override
    public boolean isOperator() {
        return operator;
    }
}
