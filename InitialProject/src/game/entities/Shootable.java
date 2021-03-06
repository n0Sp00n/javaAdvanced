package game.entities;


import java.awt.*;

public interface Shootable {

    void tick();

    void render(Graphics graphics);

    boolean intersects(Rectangle player);

    boolean isInRange();
}
