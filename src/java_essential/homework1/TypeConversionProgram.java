package java_essential.homework1;

public class TypeConversionProgram {
    public static void main(String[] args) {
        byte byteValue = 10;
        short shortValue = 20;
        char charValue = 'A';
        int intValue = 100;
        long longValue = 1000L;
        float floatValue = 3.14f;
        double doubleValue = 3.1416;
        boolean booleanValue = true;

        System.out.println("Original values:");
        System.out.println("byteValue: " + byteValue);
        System.out.println("shortValue: " + shortValue);
        System.out.println("charValue: " + charValue);
        System.out.println("intValue: " + intValue);
        System.out.println("longValue: " + longValue);
        System.out.println("floatValue: " + floatValue);
        System.out.println("doubleValue: " + doubleValue);
        System.out.println("booleanValue: " + booleanValue);

        shortValue = byteToShort(byteValue);
        intValue = charToInt(charValue);
        longValue = intToLong(intValue);
        floatValue = longToFloat(longValue);
        doubleValue = floatToDouble(floatValue);
        intValue = booleanToInt(booleanValue);

        System.out.println("\nAfter conversions:");
        System.out.println("byteValue to shortValue: " + shortValue);
        System.out.println("charValue to intValue: " + intValue);
        System.out.println("intValue to longValue: " + longValue);
        System.out.println("longValue to floatValue: " + floatValue);
        System.out.println("floatValue to doubleValue: " + doubleValue);
        System.out.println("booleanValue to intValue: " + intValue);
    }

    // Conversion methods
    public static short byteToShort(byte value) {
        return value;
    }

    public static int charToInt(char value) {
        return value;
    }

    public static long intToLong(int value) {
        return value;
    }

    public static float longToFloat(long value) {
        return value;
    }

    public static double floatToDouble(float value) {
        return value;
    }

    public static int booleanToInt(boolean value) {
        return value ? 1 : 0;
    }
}
