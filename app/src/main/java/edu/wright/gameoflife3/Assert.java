package edu.wright.gameoflife3;

public class Assert {
    public static Boolean ENABLE_ASSERT = false;

    public static void assertTrue(boolean condition) throws AssertionError {
        if(ENABLE_ASSERT) {
            if (!condition) {
                throw new AssertionError("");
            }
        }
    }
}
