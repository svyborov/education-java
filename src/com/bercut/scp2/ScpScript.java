package com.bercut.scp2;

public class ScpScript {
    void runScript(String[] memory) {
        memory[0] = "+7321124123";
        memory[1] = "0";
        memory[2] = "5";

        Cut7 cut7 = new Cut7();

        cut7.runScript(memory);

    }
}
