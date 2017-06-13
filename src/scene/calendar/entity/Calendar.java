package scene.calendar.entity;

import java.util.GregorianCalendar;

/**
 * Created by Liu Woon Kit on 23/11/2016.
 */
public class Calendar {
    private GregorianCalendar date = new GregorianCalendar();

    private final String[] dayOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    private final String[] monthOfYear = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    private final int CURRENT_DAY = date.get(GregorianCalendar.DAY_OF_MONTH);
    private final int CURRENT_MONTH = date.get(GregorianCalendar.MONTH);
    private final int CURRENT_YEAR = date.get(GregorianCalendar.YEAR);

    private int selectedDay = CURRENT_DAY;
    private int selectedMonth = CURRENT_MONTH;
    private int selectedYear = CURRENT_YEAR;

    private int firstDayOfMonth;
    private int lastDayOfMonth;

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public String[] getDayOfWeek() {
        return dayOfWeek;
    }

    public String[] getMonthOfYear() {
        return monthOfYear;
    }

    public int getCURRENT_DAY() {
        return CURRENT_DAY;
    }

    public int getCURRENT_MONTH() {
        return CURRENT_MONTH;
    }

    public int getCURRENT_YEAR() {
        return CURRENT_YEAR;
    }

    public int getSelectedDay() {
        return selectedDay;
    }

    public void setSelectedDay(int selectedDay) {
        this.selectedDay = selectedDay;
    }

    public int getSelectedMonth() {
        return selectedMonth;
    }

    public void setSelectedMonth(int selectedMonth) {
        this.selectedMonth = selectedMonth;
    }

    public int getSelectedYear() {
        return selectedYear;
    }

    public void setSelectedYear(int selectedYear) {
        this.selectedYear = selectedYear;
    }

    public void setFirstDayOfMonth(int firstDayOfMonth) {
        this.firstDayOfMonth = firstDayOfMonth;
    }

    public void setLastDayOfMonth(int lastDayOfMonth) {
        this.lastDayOfMonth = lastDayOfMonth;
    }

    public int getFirstDayOfMonth() {
        date.set(GregorianCalendar.DAY_OF_MONTH, 1);
        return date.get(GregorianCalendar.DAY_OF_WEEK);
    }

    public int getMaxDaysOfMonth() {
        lastDayOfMonth = date.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
        return lastDayOfMonth;
    }

    public String getPreviousMonth() {
        return monthOfYear[selectedMonth - 1].toUpperCase();
    }

    public String getNextMonth() {
        return monthOfYear[selectedMonth + 1].toUpperCase();
    }

    public String toString() {
        return monthOfYear[selectedMonth].toUpperCase() + ", " + selectedYear;
    }
}