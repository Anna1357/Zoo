package org.itstep;
import java.util.Objects;

public class Date {
    private final int dayy;
    private final int monthh;
    private final int yearr;

    public Date(int dayy, int monthh, int yearr) {
        this.dayy = dayy;
        this.monthh = monthh;
        this.yearr = yearr;
    }

    public int getDayy() {
        return dayy;
    }

    public int getMonthh() {
        return monthh;
    }

    public int getYearr() {
        return yearr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Date date = (Date) o;
        return dayy == date.dayy &&
                monthh == date.monthh &&
                yearr == date.yearr;
    }

    @Override
    public int hashCode() {
        return Objects.hash( dayy, monthh, yearr );
    }

    @Override
    public String toString() {
        return  + dayy + "/" + monthh + "/" + yearr;
    }
}

