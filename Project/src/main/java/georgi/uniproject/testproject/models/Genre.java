package georgi.uniproject.testproject.models;

import java.util.*;

public class Genre {

    private String name;
    private Set<Genre> children;
    private Genre parent;
	
    /**
     * Default constructor
     */
    public Genre() {
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
    public Genre getParent() {
        return parent;
    }

    /**
     * @param parent 
     * @return
     */
    public void setParent(Genre parent) {
        this.parent=parent;
    }

    /**
     * @return
     */
    public Set<Genre> getChildren() {
    	if(null == children) {
    		children= new HashSet<>();
    	}
        return children;
    }

}