package example.com.l1surfaceview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Adminstrator on 2017/2/12.
 */

public class GameView extends SurfaceView implements SurfaceHolder.Callback {
    private Container container;
    private Myrect myrect;
    private MyCircle myCircle;
    private Myline myline;
    public GameView(Context context) {
        super(context);
        container=new Container();
        myrect=new Myrect();
        myCircle=new MyCircle();
        myline=new Myline();
        myCircle.addchildview(myline);
        myrect.addchildview(myCircle);
        container.addchildview(myrect);
        getHolder().addCallback(this);
    }
    public void draw(){
        Canvas canvas=getHolder().lockCanvas();
        canvas.drawColor(Color.WHITE);
        myrect.draw1(canvas);
   /*     myrect.childview(canvas);
        myCircle.childview(canvas);
        myline.childview(canvas);
        container.childview(canvas);*/
        getHolder().unlockCanvasAndPost(canvas);
    }
    private Timer timer=null;
    private TimerTask task=null;
    public void starttimer(){
        timer=new Timer();
        task=new TimerTask() {
            @Override
            public void run() {
                draw();
            }
        };
        timer.schedule(task,100,10);//delay  period周期
    }
    public void stoptimer(){
        if (timer!=null){
            timer.cancel();
            timer=null;
        }
    }
    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        starttimer();
    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        stoptimer();
    }
}
