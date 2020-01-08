package zw.co.cytex.polls.payload;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
/**
 * @author : Webster Moswa
 * @since : 1/7/20, Tue
 * email: webstermoswa11@gmail.com
 * mobile: 0771407147
 **/


public class PollLength {
    @NotNull
    @Max(7)
    private Integer days;

    @NotNull
    @Max(23)
    private Integer hours;

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
