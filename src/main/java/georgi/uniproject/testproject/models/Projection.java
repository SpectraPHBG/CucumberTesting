package georgi.uniproject.testproject.models;

import java.util.Date;

public class Projection {

    private Date projectionDate;
    private Auditorium auditorium;
    private Movie movie;
    private Cinema cinema;
	
    /**
     * Default constructor
     */
    public Projection(int seatCount) {
    	this.movie=new Movie();
    	this.projectionDate=new Date();
    	this.auditorium=new Auditorium(seatCount);
    	this.cinema=new Cinema();
    }
    
    public Projection(String movieName, Date projectionDate, int seatCount) {
    	this.movie=new Movie(movieName);
    	this.projectionDate=projectionDate;
    	this.auditorium=new Auditorium(seatCount);
    	this.cinema=new Cinema();
    }

    /**
     * @return
     */
    public Date getProjectionDate() {
        return projectionDate;
    }

    /**
     * @param projectionDate 
     * @return
     */
    public void setProjectionDate(Date projectionDate) {
        this.projectionDate=projectionDate;
    }

    /**
     * @return
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     * @param movie 
     * @return
     */
    public void setMovie(Movie movie) {
        this.movie=movie;
    }
    
    /**
     * @return
     */
    public Cinema getCinema() {
        return cinema;
    }

    /**
     * @param cinema 
     * @return
     */
    public void setCinema(Cinema cinema) {
        this.cinema=cinema;
    }

    /**
     * @return
     */
    public Auditorium getAuditorium() {
        return auditorium;
    }

    /**
     * @param auditorium 
     * @return
     */
    public void setAuditorium(Auditorium auditorium) {
        this.auditorium=auditorium;
    }
    
}