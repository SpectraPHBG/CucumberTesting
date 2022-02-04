package georgi.uniproject.testproject.reservation;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import georgi.uniproject.testproject.models.Projection;

public class SqlData {
	
	private List<String> ticketTypes= new ArrayList<String>();
	private int[][] takenSeats= {{3,4,6,8,9,11,14,15},{4}};
	private List<Projection> projections=new ArrayList<Projection>();
	
	public SqlData() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.HOUR_OF_DAY, 1);
		projections.add(new Projection("King's Man",calendar.getTime(),15));
		calendar.add(Calendar.HOUR_OF_DAY, 1);
		projections.add(new Projection("355",calendar.getTime(),10));
		
		ticketTypes.add("Възрастен");
	}

	public Projection getProjection(int id) {
		if(id>=0 && id<projections.size()) {
			return projections.get(id);
		}
		return null;
	}
	public int[] getTakenSeats(int id) {
		if(id>=0 && id<takenSeats.length) {
			return takenSeats[id];
		}
		return new int[0];
	}
	public int getTakenSeatsCount(int id) {
		return takenSeats[id].length;
	}
	
	public List<String> getTicketTypes() {
		return ticketTypes;
	}
}
