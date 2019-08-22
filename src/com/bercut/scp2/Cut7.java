package com.bercut.scp2;

public class Cut7 extends ScpScript {

    @Override
    void runScript(String[] memory) {
        int whereIsMsisdnCellNumber = Integer.parseInt(memory[1]);
        int whereToPlaceOutput = Integer.parseInt(memory[2]);
        String msisdnWith7 = memory[whereIsMsisdnCellNumber];

        String msisdnWithout7;

        if (msisdnWith7.startsWith("+7")) {
            msisdnWithout7 = msisdnWith7.substring(2);
        } else {
            msisdnWithout7 = msisdnWith7;
        }
    }
}
