package georgi.uniproject.testproject.models;

public class Auditorium {

	
    private int auditoriumID;
    private int seatCount;
    
    public Auditorium(int seatCount) {
    	this.seatCount=seatCount;
    }

    public int getAuditoriumID() {
        return auditoriumID;
    }

    /**
     * @param auditoriumID 
     * @return
     */
    public void setAuditoriumID(int auditoriumID) {
        this.auditoriumID=auditoriumID;
    }

    /**
     * @return
     */
    public int getSeatCount() {
        return seatCount;
    }

    /**
     * @param seatCount 
     * @return
     */
    public void setSeatCount(int seatCount) {
        this.seatCount=seatCount;
    }

}