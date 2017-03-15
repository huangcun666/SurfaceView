package example.com.l1surfaceview;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.hardware.camera2.params.ColorSpaceTransform;

/**
 * Created by Adminstrator on 2017/2/21.
 */

public class Myline extends Container {
    private Paint paint;
        public Myline(){
            paint=new Paint();
            paint.setColor(Color.GRAY);
        }

    @Override
    public void childview(Canvas canvas) {
        super.childview(canvas);
        canvas.drawLine(50,0,50,100,paint);
    }
}
