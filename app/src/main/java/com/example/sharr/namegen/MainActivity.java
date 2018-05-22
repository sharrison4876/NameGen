package com.example.sharr.namegen;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    public String[] firstNameArray = new String[]{"Kiddy", "Kit", "Drunken", "Beast", "Red", "Blue", "Green", "Black", "White", "Dark", "Light", "Handsome", "Dangerous","Lethal", "Sly", "Witty", "Creative", "Honest", "Boring", "Sad", "Bright", "Frosty", "Anxious", "Brilliant", "Choppy", "Washed", "Delicous", "Cutthroat", "Quiet", "Live", "Lively", "Top", "Bottom", "Mystery", "Clock", "Mastermind", "Carnivorous", "Candy", "Caddy", "Golf", "Beat", "Fat", "Skinny", "Old", "True", "Quest", "Deaf", "Annoying", "Laser", "Flip", "Clean", "Flop", "Try-Hard", "Do-Little", "Truck" , "Little", "Mad Man", "Play Boy", "Macho", "Illiterate", "Underdog", "Spaghetti", "God", "360", "180", "Rock", "Pack", "Wasted" , "High", "Low", "Block", "Child", "Run", "Master", "Funny", "Hitbox", "Dead", "Ready", "Steady" , "Bottle Neck", "Sloppy", "Necessary", "Unnecessary", "Trauma", "Hoodie", "Blood", "Waste", "Many", "Acid", "Screw", "Clockwork", "Sitcom", "Nintendo", "Slow", "Fast", "Dive", "Fall", "Over", "Trap", "Bounty", "Trash", "Lunchbox", "Fallen", "Felony", "Careless", "Riveter", "Screwdriver", "Political", "Sergeant", "Prospect", "Creator", "Blatant", "Tribal", "Traitor", "Discover", "Key", "Driver", "AC", "PC", "Po", "Bo", "Muse", "Mouse", "Donatello", "Arkham", "Heart", "Air-tight", "Skeleton", "Skin", "Bastard", "Shipwreck", "Last", "Shot", "Super", "Bat", "Cry", "Wolf", "Unitelligent", "Manslaughter", "Rank", "Rich", "Poor", "Rare", "Common", "Common-man", "Fun",  "Commoner", "Comissioner" , "Captain", "Jazz", "Path", "Booze", "Drink", "Action","Alpha", "Charlie", "Echo", "Bravo", "Delta"};
    public String[] middleNameArray = new String[]{"Adam", "Aaron"};
    public String[] lastNameArray = new String[]{"Drive", "Cop", "Work", "Phone", "Red", "White", "Blue", "Orange", "Fly", "Ready", "Man", "Kill", "Killer", "Lady", "Whisper", "Bud", "Many", "Skeleton", "Skin", "Acid", "Beauty Man", "Whitewall", "Brain", "Timelapse", "Wish", "Charlie", "Power", "Power Top", "Power Bottom", "360", "180", "Terminator", "Topspin", "Backspin", "Tryout", "Football", "American", "Chinese", "Japanese", "Front Foot", "Barely Dead", "Quest", "Genius", "Wonder", "Disturb", "Jaw", "Frag", "Thief", "Devil", "Decimal Point", "Sum", "Dog", "Beater", "Songs", "Music", "Button", "Car Ride", "Skill", "Flavor", "Taste", "Door", "Problem", "Whisker", "Do", "Collered Shirt", "Shirt", "Hoodie", "Wookie", "Wake Up", "Predator", "Brave", "Lotus", "Plebian", "Zombie", "Politician", "Major", "Turkey", "Dead", "Chopper", "Lackey", "Veronica", "Celtic", "Distant", "Crab", "Academy", "Worshipper", "Mundane", "Jerk", "Zepplin", "Asylum", "Summer", "Winter", "Sea", "Map", "Mapper", "Trapper", "Heart", "Petty", "Skill", "Cry", "Justice", "League", "Zap", "360", "180", "Press", "Shame", "Bastard", "King", "Keep", "Blood", "Warden", "Shot", "Manslaughter", "Cry", "Wolf", "Wall", "Link", "Lock", "Like", "Tower", "Found", "Lost", "Jazz", "Church" , "Walk", "Way", "Still", "Shine", "Stop", "Smell", "Gun", "Fun", "Spit", "Taste", "the One", "the Bad", "the Kid", "the Alive", "the Dead", "the Master", "the Speaker", "the One Who Knocks", "the Killer", "the Wonder", "the Great", "the Young", "the Old", "the Man", "the Crocodile", "the Dale", "the Wish", "the None", "the Missing" , "the Guessing", "Action", "Actual", "the Righteous", "Dogpile", "Chronic", "Fever"};

    public int[] num1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public int[] num2 = num1;
    // can replace num1 and num2 with min and max
    public int max = 1;
    public int min = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button genName = (Button) findViewById(R.id.genName);
        final Random rdm = new Random();
        genName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                TextView name = (TextView)  findViewById(R.id.returnName);
                //String result = "Sup";
                String result = firstNameArray[rdm.nextInt(firstNameArray.length)] + " " + lastNameArray[rdm.nextInt(lastNameArray.length)];
                name.setText(result);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
