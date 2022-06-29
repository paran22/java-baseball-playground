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
        return PLUS.sign.equals(sign);
    }

    public static boolean isMinus(String sign) {
        return MINUS.sign.equals(sign);
    }

    public static boolean isDivision(String sign) {
        return DIVISION.sign.equals(sign);
    }

    public static boolean isMultiply(String sign) {
        return MULTIPLY.sign.equals(sign);
    }
}
