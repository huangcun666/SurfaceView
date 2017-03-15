package example.com.l1surfaceview;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by Adminstrator on 2017/2/12.
 */

public class Myrect extends Container {
    private Paint paint=null;
    public Myrect(){
        paint=new Paint();
        paint.setColor(Color.RED);
    };

    @Override
    public void childview(Canvas canvas) {
        super.childview(canvas);
        canvas.drawRect(0,0,100,100,paint);
        this.setY(this.getY()+2);
    }
}
