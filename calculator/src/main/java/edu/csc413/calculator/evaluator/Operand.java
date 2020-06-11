package edu.csc413.calculator.evaluator;

/**
 * Operand class used to represent an operand
 * in a valid mathematical expression.
 */
public class Operand {

     int operandValue ;
    /**
     * construct operand from string token.
     */
    public Operand(String token) {
        this.operandValue = Integer.valueOf(token);

    }

    /**
     * construct operand from integer
     */
    public Operand(int value) {
        this.operandValue = value;

    }

    /**
     * return value of operand
     */
    public int getValue() {
        return operandValue;
    }

    /**
     * Check to see if given token is a valid
     * operand.
     */
    public static boolean check(String token) {
        try{
            Integer.parseInt(token);
        }catch (Exception ex){
            return false;
        }
        return true;
    }
}
