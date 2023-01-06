package fifth;

import java.util.Calendar;

public class CheckLeapYear {

	public boolean checkleap(int year) {
		Calendar cal= Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		int days=cal.getActualMaximum(Calendar.DAY_OF_YEAR);
		
		if(days>365) {
			return true;
		}
		return false;
	}
}

//public static boolean doesLeapYear(int year){
//    return (year%400 == 0) || ((year%100) != 0 && (year%4 == 0));
//}
//}