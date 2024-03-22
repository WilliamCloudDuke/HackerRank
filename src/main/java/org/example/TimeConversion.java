package org.example;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        String s1 = "07:05:45PM";
        String result1 = timeConversion(s1);
        assertEquals("19:05:45", result1);

        String s2 = "12:40:22AM";
        String result2 = timeConversion(s2);
        assertEquals("00:40:22", result2);
    }
    public static String timeConversion(String s) {
        StringBuilder sb = new StringBuilder();
        if(s == null || s.length() != 10){
            throw new IllegalArgumentException("Hours must have a valid value");
        }
        String hour = s.substring(0, 2);
        String minutes_seconds = s.substring(2, 8);
        //Let's do Morning hours
        if(s.contains("AM")){
            if(hour.equals("12")){
                sb.append("00");
            } else {
                sb.append(hour);
            }
        } else {
            //Let's do afternoon hours
            if(s.contains("PM")){
                switch(hour){
                    case "12":
                        sb.append("12");
                        break;
                    case "01":
                        sb.append("13");
                        break;
                    case "02":
                        sb.append("14");
                        break;
                    case "03":
                        sb.append("15");
                        break;
                    case "04":
                        sb.append("16");
                        break;
                    case "05":
                        sb.append("17");
                        break;
                    case "06":
                        sb.append("18");
                        break;
                    case "07":
                        sb.append("19");
                        break;
                    case "08":
                        sb.append("20");
                        break;
                    case "09":
                        sb.append("21");
                        break;
                    case "10":
                        sb.append("22");
                        break;
                    case "11":
                        sb.append("23");
                        break;
                    default:
                        throw new IllegalArgumentException("unsupported hour");
                }
            } else {
                throw new IllegalArgumentException("Hours does not have a valid format");
            }
        }
        return sb.append(minutes_seconds).toString();
    }
}
