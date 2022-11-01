package Q7Challange;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;

public class Clock {
    private int minutes;
    private int hours;

    private int alarmHours;
    private int alarmMinutes;

    public Clock() {
        Instant instant = Instant.now();
        LocalDateTime time = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());

        this.minutes = time.getMinute();
        this.hours = time.getHour();
    }

    public int getMinutes() {
        return minutes;
    }

    public int getHours() {
        return hours;
    }

    public String isAlarmRing() {
        int total_currenTime = (hours*60) + minutes;
        int total_alarmTime = (alarmHours*60) + alarmMinutes;

        if (total_currenTime >= total_alarmTime){
            return "Alarm is ringing...";
        }
        else {
            return "Alarm is not ringing.";
        }
    }

    public void setAlarm(int hh, int mm) {
        this.alarmHours = hh;
        this.alarmMinutes = mm;
    }

    public String getTime(){
        String minutes = "";
        if (getMinutes() < 10){
            minutes = "0"+getMinutes();
        }
        else {
            minutes = String.valueOf(getMinutes());
        }
        return getHours() +":"+minutes;
    }
}
