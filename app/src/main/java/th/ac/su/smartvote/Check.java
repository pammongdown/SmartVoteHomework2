package th.ac.su.smartvote;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Check extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);


        Button button_check = findViewById(R.id.button_check);

        button_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText_id = findViewById(R.id.editText_ID);
                String ID = editText_id.getText().toString();
                if(editText_id.length()!=13){
                    Toast t = Toast.makeText(Check.this,"กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก",Toast.LENGTH_LONG);
                    t.show();
                }
                else {
                    if (ID.equals("1111111111111") || ID.equals("2222222222222")) {
                        AlertDialog.Builder dialog = new AlertDialog.Builder(Check.this);
                        dialog.setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง");
                        dialog.setMessage("คุณเป็นผู้มีสิทธิเลือกตั้ง");
                        dialog.setPositiveButton("Ok", null);
                        dialog.show();

                        }
                    else {
                        AlertDialog.Builder dialog = new AlertDialog.Builder(Check.this);
                        dialog.setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง");
                        dialog.setMessage("คุณไม่มีสิทธิเลือกตั้ง");
                        dialog.setPositiveButton("Ok", null);
                        dialog.show();

                        }
                    }








            }
        });
    }
}