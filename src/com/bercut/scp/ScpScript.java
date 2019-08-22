package com.bercut.scp;

public class ScpScript {
    void runScript(String[] memory) {
        System.out.println("runScript");
        String[] localHLParams = new String[6];
        localHLParams[0] = memory[0]; // msisdn
        localHLParams[1] = "0";
        localHLParams[2] = "5";

        Cut7 cut7 = new Cut7();
        cut7.runScript(localHLParams);
        String newMsisdn = localHLParams[5];
        System.out.println("runScript end");
    }
}
