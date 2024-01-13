package br.guedes.gestor.util;

public class DataValidator {

    public static boolean validateString(String data) {
        if (data == null || data.isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean validateCPF(String cpf) {
        if (cpf == null || cpf.isEmpty()) {
            return false;
        }
        if (!cpf.matches("\\d+")) {
            return false;
        }
        if (cpf.length() != 11) {
            return false;
        }
        return true;
    }

    public static boolean validatePhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.isEmpty()) {
            return false;
        }
        if (!phoneNumber.matches("\\d{10,11}")) {
            return false;
        }
        return true;
    }

    public static boolean validateValue(String value) {
        if (value == null || value.isEmpty()) {
            return false;
        }
        if (!value.matches("\\d+(\\.\\d{1,2})?")) {
            return false;
        }
        return true;

    }
}
