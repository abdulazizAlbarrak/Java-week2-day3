public class Shape {
    private String color;
    private boolean filled;

    Shape(){
        color = "green";
        filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled() {
        this.filled = true;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    @Override
    public String toString() {
        return "A Shape With " +
                "color='" + color + '\'' +
                ", filled=" + filled;
    }
}
