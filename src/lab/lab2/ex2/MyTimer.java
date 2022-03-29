package lab.lab2.ex2;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
public class MyTimer implements ClockTimer {
    private Calendar cal;
    private Timer timer;
    /**
     * Constructor
     */
    public MyTimer() {
        cal = Calendar.getInstance();
        timer = new Timer();
        timer.schedule(new TimerAction(), 0, 1*1000);
    }
    class TimerAction extends TimerTask {
        public void run() {
            cal = Calendar.getInstance();
            tick();
        }
    }
    public int getHour() {
        return cal.get(Calendar.HOUR_OF_DAY);
    }
    public int getMinute() {
        return cal.get(Calendar.MINUTE);
    }
    public int getSecond() {
        return cal.get(Calendar.SECOND);
    }
// Gets called by the internal timer every second to provide an accurate time base.
    public void tick() {
// DO SOMETHING
    }
}
