package sample;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Cloud extends Canvas{

    Cloud(int x,int y){
        setTranslateX(x);
        setTranslateY(y);

        setWidth(800); //ขอบเขตของรูปที่วาด
        setHeight(600);  //ขอบเขตของรูปที่วาด
    }

    public void fill(){
        GraphicsContext gc = getGraphicsContext2D();
        Color c ;
        gc.setFill(c = Color.rgb(255, 255, 255, 1));
        gc.fillOval(this.getTranslateX()+100, this.getTranslateY()+40 ,30, 30);//เมฆ 1
        gc.fillOval(this.getTranslateX()+120, this.getTranslateY()+20 ,50, 50);//เมฆ 1
        gc.fillOval(this.getTranslateX()+160, this.getTranslateY()+40 ,30, 30);//เมฆ 1

        gc.fillOval(this.getTranslateX()+600, this.getTranslateY()+190 ,50, 50);//เมฆ 2
        gc.fillOval(this.getTranslateX()+630, this.getTranslateY()+170 ,80, 80);
        gc.fillOval(this.getTranslateX()+690, this.getTranslateY()+195 ,45, 45);

        gc.fillOval(this.getTranslateX()+200, this.getTranslateY()+80 ,90, 90);//เมฆ 3
        gc.fillOval(this.getTranslateX()+260, this.getTranslateY()+50 ,120, 120);
        gc.fillOval(this.getTranslateX()+350, this.getTranslateY()+80 ,80, 80);









    }


}
