package sg.edu.np.mad.p02.activity1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        AlertDialog.Builder profile = new AlertDialog.Builder(this);
        profile.setTitle("Profile");
        profile.setMessage("MADness");
        profile.setCancelable(true);
        profile.setPositiveButton("VIEW", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent MainActivity = new Intent(ListActivity.this,
                        MainActivity.class);
                Random rand = new Random();
                int random = rand.nextInt(1000000);
                String num = Integer.toString(random);
                MainActivity.putExtra("number",num);
                startActivity(MainActivity);
            }
        });
        profile.setNegativeButton("CLOSE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });


        findViewById(R.id.listImage).setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View V){
                        AlertDialog alert = profile.create();
                        alert.show();
            }
        }
        );
    }



}