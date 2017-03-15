package example.com.surfaceview;

import android.app.NotificationManager;
import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  private Button button;
    private int notifity=1,nub=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nub++;
                NotificationManager mNotification= (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                NotificationCompat.Builder builder=new NotificationCompat.Builder(MainActivity.this);
                        builder.setContentText("你有"+nub+"条新消息");
                        builder.setContentTitle("NEW MESSAGE");
                        builder.setSmallIcon(R.mipmap.ic_launcher);
                        builder.setNumber(nub);
                mNotification.notify(notifity,builder.build());
            }
        });
    }
}
