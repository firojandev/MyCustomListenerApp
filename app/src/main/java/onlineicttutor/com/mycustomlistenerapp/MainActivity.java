package onlineicttutor.com.mycustomlistenerapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import onlineicttutor.com.mycustomlistenerapp.model.Users;
import onlineicttutor.com.mycustomlistenerapp.mylisteners.MyCustomListener;
import onlineicttutor.com.mycustomlistenerapp.mylisteners.MyCustomResults;

public class MainActivity extends AppCompatActivity {

    String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCheck=(Button)findViewById(R.id.buttonCheck);
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayMessage();
            }
        });


    }

    public void displayMessage(){
        MyCustomResults myCustomResults =new MyCustomResults();
        myCustomResults.setCustomListener(new MyCustomListener() {
            @Override
            public void onCallback(Users userData) {
                msg = userData.getName();
               Toast.makeText(MainActivity.this,"Hello "+msg,Toast.LENGTH_LONG).show();
            }
        });

    }
}
