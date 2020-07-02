package com.example.parikshit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ProductInfoActivity extends AppCompatActivity {
    EditText product_name, product_category, product_id, product_count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_info);
       product_name = findViewById(R.id.product_name);
        product_category = findViewById(R.id.product_category);
        product_id = findViewById(R.id.product_id);
        product_count = findViewById(R.id.product_count);
    }

    public void product(View view) {
        String data = " product name = "+ product_name.getText() +
                "\n product catagory = " + product_category.getText() +
                "\n product id = " + product_id.getText() +
                "\n product count" + product_count.getText();

        Toast toast = Toast.makeText(this, data,
                Toast.LENGTH_SHORT);
        toast.show();
    }
}