package application.asteroidsgameproject;

import javafx.geometry.Bounds;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

//Bullet class extends GameCharacters
public class Bullet extends GameCharacters {

    //    Constructor method in Java for a class named Bullet.
    public Bullet(int x, int y) {
        super(new Polygon(2, -2, 2, 2, -2, 2, -2, -2), x, y);
        this.getGameCharacter().setFill(Color.WHITE);

    }

}