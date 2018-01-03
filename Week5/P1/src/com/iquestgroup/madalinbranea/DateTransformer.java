package com.iquestgroup.madalinbranea;

import java.util.Calendar;
import java.util.Date;

/**
 * The transformer
 */
public class DateTransformer {
    /**
     * Transforms the date into readable format
     * @param date The date
     * @return
     */
    public static String transform(Date date) {
        StringBuilder stringDate = new StringBuilder();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        int monthOfYear = c.get(Calendar.MONTH);
        int year = c.get(Calendar.YEAR);
        Month month;
        stringDate.append(year).append(" ");
        switch (monthOfYear) {
            case 0:
                month = Month.JANUARY;
                break;
            case 1:
                month = Month.FEBRUARY;
                break;
            case 2:
                month = Month.MARCH;
                break;
            case 3:
                month = Month.APRIL;
                break;
            case 4:
                month = Month.MAY;
                break;
            case 5:
                month = Month.JUNE;
                break;
            case 6:
                month = Month.JULY;
                break;
            case 7:
                month = Month.AUGUST;
                break;
            case 8:
                month = Month.SEPTEMBER;
                break;
            case 9:
                month = Month.OCTOBER;
                break;
            case 10:
                month = Month.NOVEMBER;
                break;
            case 11:
                month = Month.DECEMBER;
                break;
            default:
                month = Month.INVALID;
                break;
        }
        stringDate.append(month).append(" ");
        Day day;
        switch (dayOfWeek) {

            case 2:
                day = Day.MONDAY;
                break;
            case 3:
                day = Day.TUESDAY;
                break;
            case 4:
                day = Day.WEDNESDAY;
                break;
            case 5:
                day = Day.THURSDAY;
                break;
            case 6:
                day = Day.FRIDAY;
                break;
            case 7:
                day = Day.SATURDAY;
                break;
            case 8:
                day = Day.SUNDAY;
                break;

            default:
                day = Day.INVALID;
                ;
                break;
        }
        stringDate.append(day).append(" ");

        return stringDate.toString();


    }
}
