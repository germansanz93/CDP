package shapes;

import java.util.Objects;

public class Circle extends Shape{
    public int radius;

    public Circle() {};

    public Circle(Circle target) {
        super(target);
        if(Objects.nonNull(target)) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape getClone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object object) {
        if(!(object instanceof Circle) || !super.equals(object)) return false;
        Circle shape = (Circle) object;
        return Objects.equals(shape.radius, this.radius);
    }
}
