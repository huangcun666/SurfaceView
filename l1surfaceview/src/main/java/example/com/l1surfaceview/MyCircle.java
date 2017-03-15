package example.com.l1surfaceview;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by Adminstrator on 2017/2/12.
 */

public class MyCircle extends Container {
    private Paint paint=null;
    public MyCircle(){
        paint=new Paint();
        paint.setColor(Color.BLUE);
    }

    @Override
    public void childview(Canvas canvas) {
        super.childview(canvas);
        canvas.drawCircle(50,50,50,paint);
    }
}
