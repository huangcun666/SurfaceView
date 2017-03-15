package example.com.l0surfaceview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by Adminstrator on 2017/2/12.
 */

public class Myview extends SurfaceView implements SurfaceHolder.Callback{
    private Paint paint=null;
    public Myview(Context context) {
        super(context);
        paint=new Paint();
        paint.setColor(Color.BLACK);
        getHolder().addCallback(this);
    }
    public void draw(){
        Canvas canvas=getHolder().lockCanvas();
        canvas.drawColor(Color.WHITE);
        canvas.save();
        canvas.rotate(90,getWidth()/2,getHeight()/2);
        canvas.drawLine(0,getHeight()/2,getWidth(),getHeight(),paint);
        canvas.restore();
        canvas.drawLine(0,getHeight()/2+100,getWidth(),getHeight()+100,paint);
        getHolder().unlockCanvasAndPost(canvas);

    }
    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {
    draw();
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {

    }
}

