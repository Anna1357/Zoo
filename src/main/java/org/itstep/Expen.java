package org.itstep;

public class Expen {
    private final double money;
    private final Date date;

    public Expen(double money, Date date) {
        this.money = money;
        this.date = date;
    }

    public double getMoney() {
        return money;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Expenses for " +date+
                "is $" + money;
    }
}

