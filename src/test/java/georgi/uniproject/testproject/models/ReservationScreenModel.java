package georgi.uniproject.testproject.models;

import java.util.List;

import georgi.uniproject.testproject.reservation.ReservationService;

public class ReservationScreenModel {

	private int projectionID;
	private int ticketCount;
	private String ticketType;
	private List<Integer> seats;
	private String email;
	private String message;
	
	public void setSeats(List<Integer> seats) {
		this.seats = seats;
	}

	public void setProjectionID(int projectionNumber) {
		this.projectionID = projectionNumber-1;
	}

	public void setTicketCount(int ticketCount) {
		this.ticketCount = ticketCount;
	}

	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}
	
	public void clickReservationButton() {
		message=ReservationService.reserve(projectionID,ticketCount,ticketType,seats,email);
	}
}
