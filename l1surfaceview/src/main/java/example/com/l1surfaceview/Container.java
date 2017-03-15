package example.com.l1surfaceview;

import android.graphics.Canvas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adminstrator on 2017/2/12.
 */

public class Container {
    private List<Container> child=null;
    private float x=0,y=0;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Container(){
      child=new ArrayList<Container>();
  }
    public void draw1(Canvas canvas){
        canvas.save();
        canvas.translate(getX(),getY());
        childview(canvas);
        for (Container c : child){
            c.draw1(canvas);
        }
        canvas.restore();
    };
    public void childview(Canvas canvas){};
    public void addchildview(Container container){
        child.add(container);
    }
}
