package georgi.uniproject.testproject.models;

public class Cinema {


    public Cinema() {
    }

    private String name;
    private String address;

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param name 
     * @return
     */
    public void setName(String name) {
        this.name=name;
    }

    /**
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address 
     * @return
     */
    public void setAddress(String address) {
        this.address=address;
    }

}