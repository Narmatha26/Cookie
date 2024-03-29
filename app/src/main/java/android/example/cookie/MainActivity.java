package android.example.cookie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        ImageView afterCookieImg = (ImageView)findViewById(R.id.android_cookie_image_view) ;
        afterCookieImg.setImageResource(R.drawable.after_cookie);

        TextView afterCookie = (TextView)findViewById(R.id.status_text_view);
        afterCookie.setText("I'm so full");
    }
}
}
