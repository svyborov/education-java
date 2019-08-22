package com.bercut.homework2;

import java.util.logging.Logger;

public class DoubleCharacter {
    static Logger logger = Logger.getLogger(DoubleCharacter.class.getName());

    static String deleteDoubleCharacters(String str) {
        boolean isAllCorrect = false;

        StringBuffer sb = new StringBuffer();


        logger.config("Строка: " + str);
        while (!isAllCorrect) {
            String[] strArr = str.split("");
            isAllCorrect = true;
            for (int i = 0; i < strArr.length; i++) {
                if (!strArr[i].equals(strArr[i - 1])) {
                    sb.append(strArr[i - 1]);
                } else {
                    isAllCorrect = false;
                }
            }
            str = sb.toString();
            logger.info("Строка: " + str);
        }
        logger.info("Строка: " + str);
        return str;
    }
}
