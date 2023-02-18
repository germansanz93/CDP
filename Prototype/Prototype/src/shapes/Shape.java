package shapes;

import java.util.Objects;

public abstract class Shape{
    public Integer x;
    public Integer y;
    public String color;

    public Shape() {};

    public abstract Shape getClone();

    public Shape(Shape target) {
        if (target != null){
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    @Override
    public boolean equals(Object object){
        if(!(object instanceof Shape)) return false;
        Shape shape = (Shape) object;
        return shape.x == this.x && shape.y == this.y && Objects.equals(shape.color, this.color);
    }
}
