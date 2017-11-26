package sample;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Ball extends Canvas {
    Ball(int x,int y){
        setTranslateX(x);
        setTranslateY(y);

        setWidth(800); //ขอบเขตของรูปที่วาด
        setHeight(600);  //ขอบเขตของรูปที่วาด
    }

    public void fill() {
        GraphicsContext gc = getGraphicsContext2D();
        Color c ;
        gc.setFill(c = Color.rgb(161, 255, 34));

        gc.fillOval(this.getTranslateX(), this.getTranslateY() ,70, 70);

    }

}
