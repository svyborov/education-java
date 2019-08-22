package com.bercut.scp;

public class Cut7 extends ScpScript {

    @Override
    void runScript(String[] memory) {
        System.out.println("runScrpt cut7");
        int whereIsMsisdnCellNumber = Integer.parseInt(memory[1]);
        int whereToPlaceOutput = Integer.parseInt(memory[2]);
        String msisdnWith7 = memory[whereIsMsisdnCellNumber];

        String msinsdWithout7;

        if (msisdnWith7.startsWith("+7")) {
            System.out.println("Source msisdn has +7! " + msisdnWith7);
            msinsdWithout7 = msisdnWith7.substring(2);
        } else  {
            System.out.println("Source msisdn has NO +7! " + msisdnWith7);
            msinsdWithout7 = msisdnWith7;
        }
        System.out.println("Store result in cell number " + whereToPlaceOutput);

        memory[whereToPlaceOutput] = msinsdWithout7;

        System.out.println("runScrpt cut7 end; Result: " + msinsdWithout7);
    }
}
