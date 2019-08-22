package com.bercut.scp;

import java.util.Arrays;

public class SCP {

    public static void main(String[] args) {
        ScpScript scpScript = new ScpScript();
        String[] memoryForScritp1 = new String[10];
        memoryForScritp1[0] = "+7393999444";
        System.out.println("Message received "+ Arrays.toString(memoryForScritp1)+" . Invoke Script.");
        scpScript.runScript(memoryForScritp1);
        System.out.println("Reply message. Script ended");
    }

}
