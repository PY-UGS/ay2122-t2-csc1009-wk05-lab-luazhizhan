package Q1;

import java.util.Date;

public class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;

    public GeometricObject() {
        this.setColor("white");
        this.filled = false;
        this.dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled) {
        this.setColor(color);
        this.filled = true;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + " color: " + color + " and filled: " + filled;
    }

}
