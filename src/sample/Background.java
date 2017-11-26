package sample;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Background extends Canvas {
    Background(int x, int y) {
        setTranslateX(x);
        setTranslateY(y);

        setWidth(800); //ขอบเขตของรูปที่วาด
        setHeight(600);  //ขอบเขตของรูปที่วาด
    }


    public void fill() {
        GraphicsContext gc = getGraphicsContext2D();
        Color c;

        gc.setFill(c = Color.rgb(205, 217, 239));//ฟ้า
        gc.fillRect(0, 0, 800, 350);

        gc.setFill(c = Color.rgb(210, 225, 239));//ฟ้า
        gc.fillRect(0, 250, 800, 150);

        gc.setFill(c = Color.rgb(239, 236, 239, 1));//ฟ้า
        gc.fillRect(0, 300, 800, 50);




        gc.setFill(c = Color.rgb(154, 214, 224, 0.7216));//ทะเล
        gc.fillRect(0, 350, 800, 100);

        gc.setFill(c = Color.rgb(17, 118, 188, 0.7216));
        gc.fillRect(0, 350, 800, 10);

        gc.setFill(c = Color.rgb(59, 204, 207, 0.7216));
        gc.fillRect(0, 350, 800, 30);

        gc.setFill(c = Color.rgb(255, 255, 255, 1));
        gc.fillRect(0, 440, 800, 10);



        gc.setFill(c = Color.rgb(255, 196, 77, 0.7216));//ทรายใหญ่
        gc.fillRect(0, 450, 800, 200);

        gc.setFill(c = Color.rgb(251, 182, 45, 0.7216));
        gc.fillRect(0, 550, 400, 10);

        gc.setFill(c = Color.rgb(250, 218, 157, 0.7216));
        gc.fillRect(100, 570, 150, 10);


        gc.setFill(c = Color.rgb(251, 182, 45, 0.7216));
        gc.fillRect(400, 500, 400, 10);


        gc.setFill(c = Color.rgb(250, 218, 157, 0.7216));
        gc.fillRect(550, 480, 100, 10);






    }
}
