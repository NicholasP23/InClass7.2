package io.github.nicholasp23.inclass7_2;
public interface CommandSource {

    String getName();
    void sendMessage(String x);
    boolean isOperator();
}
