package sample;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Crab extends Canvas{

    Crab(int x, int y){
        setTranslateX(x);
        setTranslateY(y);


        setWidth(800); //ขอบเขตของรูปที่วาด
        setHeight(600);  //ขอบเขตของรูปที่วาด
    }

    public void fill(){
        GraphicsContext gc = getGraphicsContext2D();
        Color c ;
        gc.setFill(c = Color.rgb(249, 1, 0));
        gc.fillOval(this.getTranslateX(), this.getTranslateY() ,80, 60);//ตัว


    }


}
