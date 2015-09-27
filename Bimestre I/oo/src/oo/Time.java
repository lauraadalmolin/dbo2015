package oo;

public class Time {

	public final int hours, minutes, seconds;

    public Time(int h, int m, int s) {
	    if (h < 0) h = 24 + (h % 24);
        this.seconds = s % 60;
	    this.minutes = (m +  (s / 60)) % 60;
	    this.hours = (h +  (m / 60)) % 24; 
    }

    public Time() {
        this(0, 0, 0);
    }

    public Time (int h, int m) {
		this(h, m, 0);
    }

    public Time (int h) {
	    this(h, 0, 0);
    }

	public Time plusHours (int h) {
		
        if (h < 0) this.minusHours(h*-1);
        
        return new Time (this.hours + h, minutes, seconds);
    }

    public Time minusHours (int h) {
	   return new Time (hours - h, minutes, seconds);
    }

    public Time plusMinutes (int m) {
    	
        if (m < 0) this.minusMinutes(m*-1);
    
        return new Time (hours, this.minutes + m, seconds);
    }

    public Time minusMinutes (int m) {
        
        if (m > minutes) {
            int time_s = this.hours * 3600 + this.minutes * 60 + this.seconds - m * 60;
            int h2 = time_s / 3600;
            time_s %= 3600;
            int m2 = time_s / 60;
            int s2 = time_s % 60;
            return new Time (h2, m2, s2);
        }
        
        if (m < 0) this.plusMinutes(m*-1);
        return new Time (hours, minutes - m, seconds);
    }

    public Time plusSeconds (int s) {
    	if (s < 0) this.minusSeconds(s*-1);
        return new Time (hours, minutes, this.seconds + s);
    }

    public Time minusSeconds (int s) {
    	if (s > this.seconds) {
        	int time_s = this.hours * 3600 + this.minutes * 60 + this.seconds - s;
    	    int h2 = time_s / 3600;
            time_s %= 3600;
            int m2 = time_s / 60;
            int s2 = time_s % 60;
            return new Time (h2, m2, s2);
        }
        if (s < 0) this.plusSeconds (s*-1);
            return new Time (hours, minutes, seconds - s);
    }

	public Time plus(Time t) {
        return new Time (this.hours + t.hours, this.minutes + t.minutes, this.seconds + t.seconds);
    }

    public Time minus (Time t) {       
        int r = (this.hours * 3600 + this.minutes * 60 + this.seconds) - (t.hours * 3600 + t.minutes * 60 + t.seconds);
        return new Time ((r / 3600), (r % 3600) / 60, ((r % 3600) / 60) % 60);
    }

    public boolean isMidNight () {
    	if (this.hours == 0 && this.minutes == 0 && this.seconds == 0) return true;
    	return false;
    }

    public boolean isMidDay () {
    	if (this.hours == 12 && this.minutes == 0 && this.seconds == 0) return true;
    	return false;
    }

    public Time tick () {
    	return new Time (this.hours, this.minutes, this.seconds + 1);
    }

    public Time shift () {
    	if (this.hours >= 12) return new Time (this.hours - 12, this.minutes, this.seconds);
    	return new Time (this.hours + 12, this.minutes, this.seconds);
    }

    public String toString() {
      	return (hours < 10 ? "0" + hours : hours) + ":" + (minutes < 10 ? "0" + minutes : minutes) + ":" + (seconds < 10 ? "0" + seconds : seconds);
    }

    public boolean equals(Time n) {
        return (this.hours == n.hours && this.minutes == n.minutes && this.seconds == n.seconds);
    }
    
}