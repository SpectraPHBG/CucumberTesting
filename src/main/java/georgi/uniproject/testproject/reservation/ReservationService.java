package georgi.uniproject.testproject.reservation;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import georgi.uniproject.testproject.models.Projection;

public class ReservationService {
	
	private static SqlData movieReservationDB=new SqlData();
	private static Projection selectedProjection;
	
	public static String reserve(int projectionID,int ticketCount,String ticketType,List<Integer> seats,String email) {
		
		selectedProjection=movieReservationDB.getProjection(projectionID);
		
		if(selectedProjection==null) {
			return "Избраната прожекция не съществува!";
		}
		
		if(ticketCount>(selectedProjection.getAuditorium().getSeatCount()-movieReservationDB.getTakenSeatsCount(projectionID)))
			return "Недостатъчно налични места!";
		
		if(seats==null || seats.size()==0) {
			return "Моля изберете места!";
		}
		
		for(int seat : movieReservationDB.getTakenSeats(projectionID)) {
			if(seats.contains(seat)) {
				return "Избраните места са заети!";
			}
		}
		
		if(!Pattern.matches("^[a-zA-Z0-9$,._-]+@[a-zA-Z0-9$,._-]+[.]+[a-zA-Z0-9]+$", email)) {
			return "Въведеният имейл е невалиден!";
		}
		Date currentDate=new Date();
		long diffInMillies =Math.abs(selectedProjection.getProjectionDate().getTime()-currentDate.getTime());
		long diff=TimeUnit.MINUTES.convert(diffInMillies, TimeUnit.MILLISECONDS);
		if(diff>60) {
			return "Резервациите за тази прожекция не са налични";
		}
		
		if(!movieReservationDB.getTicketTypes().contains(ticketType)) {
			return "Такъв билет не съществува!";
		}
		
		return "Успешно резервиране на билет!";
	}
}
