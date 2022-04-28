package sg.edu.np.mad.p02.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User user = new User("John","25 year old male",12345,false);
        loadProfile(user);
    }

    public void loadProfile(User user){
        TextView name = findViewById(R.id.nameBox);
        TextView desc = findViewById(R.id.descBox);
        TextView followButton = findViewById(R.id.followButton);
        name.setText(user.name);
        desc.setText((user.description));
        if(user.getFollowed() == true){
            followButton.setText("UNFOLLOW");
        }
        else{
            followButton.setText("FOLLOW");
        }
    }

    public void following(View view){
        TextView txt = findViewById(R.id.followButton);
        if (txt.getText().toString() == "FOLLOW"){
            txt.setText("UNFOLLOW");
        }
        else{
            txt.setText("FOLLOW");
        }
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

