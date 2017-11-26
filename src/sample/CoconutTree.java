package sample;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

public class CoconutTree extends Canvas{
    double[] trunkX;
    double[] trunkY;



    CoconutTree(int x, int y){

        setTranslateX(x);
        setTranslateY(y);


        setWidth(800); //ขอบเขตของรูปที่วาด
        setHeight(600);  //ขอบเขตของรูปที่วาด


        this.trunkY = new double[]{y+400,y+0,y+400};
        this.trunkX = new double[] {x+70,x+50,x+20};



    }

    public void fill(){
        GraphicsContext gc = getGraphicsContext2D();
        Color c ;
        gc.setFill(c = Color.rgb(160, 82, 45));
        gc.fillPolygon(this.trunkX, this.trunkY ,3);//ลำต้น

        gc.setFill(c=Color.rgb(80, 203, 34));
        gc.fillArc(getTranslateX()-50 ,getTranslateY()-90,200,190,75,40, ArcType.ROUND);
        gc.fillArc(getTranslateX()-50 ,getTranslateY()-90,200,190,215,40, ArcType.ROUND);
        gc.fillArc(getTranslateX()-50 ,getTranslateY()-90,200,190,0,40, ArcType.ROUND);
        gc.fillArc(getTranslateX()-50 ,getTranslateY()-90,200,190,150,40, ArcType.ROUND);
        gc.fillArc(getTranslateX()-50 ,getTranslateY()-90,200,190,300,40, ArcType.ROUND);



    }


}
