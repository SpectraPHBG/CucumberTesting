package georgi.uniproject.testproject.models;

import java.util.*;

public class Reservation {

    private Set<Integer> reservedSeats;
    private Projection projection;
    private Set<Ticket> tickets;
	
    /**
     * Default constructor
     */
    public Reservation() {
    }

    /**
     * @return
     */
    public Set<Ticket> getTickets() {
    	if(null == tickets) {
    		tickets= new HashSet<>();
    	}
        return tickets;
    }

    /**
     * @param tickets 
     * @return
     */
    public void setTickets(Set<Ticket> tickets) {
        this.tickets=tickets;
    }

    /**
     * @return
     */
    public Projection getProjection() {
        return projection;
    }

    /**
     * @param projection 
     * @return
     */
    public void setProjection(Projection projection) {
        this.projection=projection;
    }

    /**
     * @return
     */
    public Set<Integer> getReservedSeats() {
    	if(null == reservedSeats) {
    		reservedSeats= new HashSet<>();
    	}
        return reservedSeats;
    }

    /**
     * @param reservedSeats 
     * @return
     */
    public void setReservedSeats(Set<Integer> reservedSeats) {
        this.reservedSeats=reservedSeats;
    }

}