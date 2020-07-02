package com.example.parikshit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SendInfoActivity extends AppCompatActivity {
    private EditText mMessageEditText;
   TextView employee;
    public static final String EXTRA_MESSAGE =
            "com.example.android.twoactivities.extra.MESSAGE";

//    EditText employee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_info);
//        employee = (R.id.empID);
//        TextView employee = (TextView)findViewById(R.id.empID);
//        employee.setText(message);
        employee =  findViewById(R.id.empID);
    }

    public void Sendinfo(View view) {
//        Intent intent = new Intent(this, ReceiveInfoActivity.class);
//        String message = mMessageEditText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
//        startActivity(intent);

//        if ( employee == 1234 )
//            Intent intent = new Intent(this, ReceiveInfoActivity.class),
//            String message = mMessageEditText.getText().toString();
//            Toast toast = Toast.makeText(this, R.string.toast_message1,
//                    Toast.LENGTH_SHORT),
//            toast.show(),
//            intent.putExtra(EXTRA_MESSAGE, message),
//            startActivity(intent);
//
//        else
//
//            Toast toast = Toast.makeText(this, R.string.toast_message2,
//                    Toast.LENGTH_SHORT)
//            toast.show();
        String abc = (String) employee.getText().toString();
        Log.i("Employee ki value ", "are mein hu " + abc);
        if (abc.equalsIgnoreCase("2234")) {
            Intent intent = new Intent(this, ReceiveInfoActivity.class);


                    intent.putExtra(EXTRA_MESSAGE, "sffsgdfrgdf");
                    startActivity(intent);
        } else  {
            Toast toast = Toast.makeText(this, R.string.toast_message2,
                    Toast.LENGTH_SHORT);
            toast.show();
        }

    }
}