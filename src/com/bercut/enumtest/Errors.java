package com.bercut.enumtest;

import java.util.ArrayList;
import java.util.List;

public enum  Errors {
    ERROR_PERMISSION_DENIED(2020, "Вам недоступна эта операция"),
    ERROR_SERVER_FAILURE(2022, "Сбой сервера"),
    ERROR_CLIENT_FAILURE(2023, "Клиент ушел"),;

    private int errorCode;
    private String description;

    static class Codes {
        private static final List<Integer> codes = new ArrayList<>();
    }

    Errors(int errorCode, String description) {
        if (Codes.codes.contains(errorCode)) {
            throw new IllegalStateException("dupluicate code");
        }
        Codes.codes.add(errorCode);
        this.errorCode = errorCode;
        this.description = description;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getDescription() {
        return description;
    }
}
