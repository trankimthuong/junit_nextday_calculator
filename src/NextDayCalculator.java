public class NextDayCalculator {
    public static Date nextDay(Date nowDate){
        if(nowDate.getDay() == maxDayInMonth(nowDate)){
            if(nowDate.getMonth() == 12){
                nowDate.setYear(nowDate.getYear() + 1);
                nowDate.setMonth(1);
                nowDate.setDay(1);
            }else{
                nowDate.setMonth(nowDate.getMonth() + 1);
                nowDate.setDay(1);
            }
        }else{
            nowDate.setDay(nowDate.getDay() + 1);
        }
        return nowDate;
    }

    public static int maxDayInMonth(Date date){
        switch (date.getMonth()){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if(isLeapYear(date.getYear())){
                    return 29;
                }else{
                    return 28;
                }
            default:
                return -1;
        }
    }

    public static boolean isLeapYear(int year){
        if(year % 4 == 0){
            if(year % 400 == 0){
                return true;
            }
            else if(year % 100 == 0){
                return false;
            }else{
                return true;
            }
        }
        return false;
    }
}
