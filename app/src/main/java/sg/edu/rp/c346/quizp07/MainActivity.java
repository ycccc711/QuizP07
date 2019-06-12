package sg.edu.rp.c346.quizp07;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lvInfo;
    ArrayAdapter<String> adapter;
    String[] arrayItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvInfo = findViewById(R.id.listViewInfo);

        arrayItems = new String[3];
        arrayItems[0] = "Item 1 ";
        arrayItems[1] = "Item 2 ";
        arrayItems[2] = "Item 3 ";

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayItems);
        lvInfo.setAdapter(adapter);
    }
}
