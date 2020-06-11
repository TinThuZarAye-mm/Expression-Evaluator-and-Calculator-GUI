package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class DivideOperator extends Operator{
    @Override
    public int priority(){
        return 2;
    }
    @Override
    public Operand execute(Operand operandOne, Operand operandTwo) {
        Operand divide = new Operand(operandOne.getValue() / operandTwo.getValue());
        return divide;
    }
}
