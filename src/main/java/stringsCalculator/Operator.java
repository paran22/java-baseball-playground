package stringsCalculator;

public enum Operator {
    PLUS("+"),
    MINUS("-"),
    DIVISION("/"),
    MULTIPLY("*");

    private final String sign;

    Operator(String sign) {
        this.sign = sign;
    }

    public static boolean isPlus(String sign) {
        return sign.equals(PLUS.sign);
    }

    public static boolean isMinus(String sign) {
        return sign.equals(MINUS.sign);
    }

    public static boolean isDivision(String sign) {
        return sign.equals(DIVISION.sign);
    }

    public static boolean isMultiply(String sign) {
        return sign.equals(MULTIPLY.sign);
    }
}
