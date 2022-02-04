package georgi.uniproject.testproject.models;

public class Ticket {

    private String type;
    private double price;
	
    /**
     * Default constructor
     */
    public Ticket() {
    }


    /**
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * @param type 
     * @return
     */
    public void setType(String type) {
        this.type=type;
    }

    /**
     * @return
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price 
     * @return
     */
    public void setPrice(double price) {
        this.price=price;
    }
}