package calendarScene;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Day {
	
	private Date dateofDay;
	private int dayOfWeek = 0;
	private ArrayList<String> clients;
	

	public Day(Date dateofDay, int dayOfWeek) {
		super();
		this.dateofDay = dateofDay;
		this.dayOfWeek = dayOfWeek;
		clients = new ArrayList<>();
	}

	public ArrayList<String> getClients() {
		return clients;
	}

	public Date getDateofDay() {
		return dateofDay;
	}

	public void setDateofDay(Date dateofDay) {
		this.dateofDay = dateofDay;
	}
	
	public int getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(int dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd.MM.yyyy.");
		
		String clients;
		StringBuilder sb = new StringBuilder();
		for(String clt: this.clients)
		{
			sb.append(clt+" ");
		}
		clients = sb.toString();
		
		try {
			if(getDateofDay().equals(sdf2.parse("01.01.1998.")))
			{
				return "";
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return sdf.format(dateofDay)+".\n"+clients+"\n ";
	}

}