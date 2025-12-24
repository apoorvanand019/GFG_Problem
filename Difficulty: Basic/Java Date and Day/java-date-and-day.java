class Solution {
    static String findDay(int Day, int Month, int Year) {
        // Code Here
        Calendar cal=Calendar.getInstance();
        cal.set(Year, Month -1, Day);
        
        int dayOfWeek=cal.get(Calendar.DAY_OF_WEEK);
        
        String[] days={
            "SUNDAY",
            "MONDAY",
            "TUESDAY",
            "WEDNESDAY",
            "THURSDAY",
            "FRIDAY",
            "SATURDAY"
        };
        return days[dayOfWeek - 1];
        
    }
}