package shapes;

import java.util.Objects;

public class Rectangle extends Shape{
    public int width;
    public int height;

    public Rectangle() {};

    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Shape getClone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Rectangle) || !super.equals(object)) return false;
        Rectangle shape = (Rectangle) object;
        return Objects.equals(shape.width, this.width) && Objects.equals(shape.height, this.height);
    }
}
