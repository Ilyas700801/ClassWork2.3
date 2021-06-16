package com.Geekteck;

public class BankAccount {
    private double amount;
    private double sum;

    public double getSum() {
        return sum;
    }

    public double getAmount() {
        return amount;
    }
    public double deposite(double sum){
        this.sum = sum;
        return this.amount += sum;

    }
    public int wiyhDraw(int sum)throws LimitException{
        this.sum = sum;
        if (sum > amount) {
            throw new LimitException("запрашиваемая сумма больше остатка " + amount, amount);
        }
        return (int) (this.amount -= sum);

    }

}
