package Q7Challange;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;
import java.util.TimeZone;

public class WorldClock extends Clock{
    private int minutes;
    private int hours;


    public WorldClock(int zone) {
        Date today = new Date();

        //get current location GTM time zone
        int offset = findCurrentZone();
        int timeZoneInt = offset+zone;

        String timeZone;
        if (timeZoneInt >= 0){
            timeZone = "GMT+"+timeZoneInt;
        }
        else {
            timeZone = "GMT"+timeZoneInt;
        }

        DateFormat dfh = new SimpleDateFormat("HH");
        dfh.setTimeZone(TimeZone.getTimeZone(timeZone));

        DateFormat dfm = new SimpleDateFormat("mm");
        dfm.setTimeZone(TimeZone.getTimeZone(timeZone));

        hours = Integer.parseInt(dfh.format(today));
        minutes = Integer.parseInt(dfm.format(today));

        System.out.println(hours + ":" + minutes);
    }


    private static int findCurrentZone(){
        DateFormat df = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
        df.setTimeZone(TimeZone.getDefault());
        LocalDateTime localDateTime = LocalDateTime.now();
        ZoneId id = ZoneId.of(String.valueOf(df.getTimeZone().toZoneId()));
        ZonedDateTime zonedDateTime = localDateTime.atZone(id);
        ZoneOffset zoneOffset = zonedDateTime.getOffset();

        String offset =  zoneOffset.getId().replaceAll("z", "+00:00");

        String currentZoneSign = String.valueOf(offset.charAt(0));
        int currentZone = Integer.parseInt(String.valueOf(offset.charAt(1)+""+offset.charAt(2)));

        if (currentZoneSign.equals("-")){
            currentZone = -(currentZone);
        }

        return currentZone;
    }
}
