package sg.edu.np.mad.p02.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void anyName(View view){
        //TextView txt = findViewById();//R.id.'idofbutton'
        //txt.setText("Hello World");
    }

    public class User{

        String name;
        String description;
        int id;
        boolean followed;

        //Name
        public void setName(String n)
        {
            name = n;
        }

        public String getName(){
            return name;
        }

        //Description
        public void setDescription(String d){
            description = d;
        }

        public String getDescription(){
            return description;
        }

        //ID
        public void setId(int identity)
        {
            id = identity;
        }

        public int getId(){
            return id;
        }

        //Followed
        public void setFollowed(boolean f){
            followed = f;
        }

        public boolean getFollowed(){
            return followed;
        }

        public User(String n, String d, int identity, boolean f){
            name = n;
            description = d;
            id = identity;
            followed = f;
        }

    }
}

