package tenth;

public class ClockAngleProblem {
//hour hand does 360 in 12hrs
//minute hand does 360 in 1hr(60min)
//return shorter angle b/w hour hand and minute hand.
	public static int clockangle(int hh,int mm) {
		
		hh=hh%12; // 24hr clock
		
		int h=(hh*360)/12 +(mm*360)/(12*60);
		//position of the hour hand
		int m=(mm*360)/60;
		//postion of the minute hand
		
		int angle =Math.abs(h-m);
		
		if(angle>180) {
			angle=360-angle;
		}
		return angle;
		
	}
}
