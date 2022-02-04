package georgi.uniproject.testproject.models;

import java.util.*;

public class Movie {

    private String name;
    private int length;
    private Set<Genre> genres;
	
    /**
     * Default constructor
     */
    public Movie() {
    }
    
    /**
     * Default constructor
     */
    public Movie(String name) {
    	this.name=name;
    }

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
    public int getLength() {
        return length;
    }

    /**
     * @param length 
     * @return
     */
    public void setLength(int length) {
        this.length=length;
    }

    /**
     * @return
     */
    public Set<Genre> getGenres() {
    	if(null == genres) {
    		genres= new HashSet<>();
    	}
        return genres;
    }

    /**
     * @param genres 
     * @return
     */
    public void setGenres(Set<Genre> genres) {
        this.genres=genres;
    }

}