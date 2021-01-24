package com.example.work2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val a = Toast.makeText(applicationContext,"ห้าม username กับ passwordเหมือนกัน.",Toast.LENGTH_LONG)
        val b = Toast.makeText(applicationContext,"รหัสผ่านไม่ตรงกัน.",Toast.LENGTH_LONG)
        val c = Toast.makeText(applicationContext,"กรอกให้ครบทุกช่อง.",Toast.LENGTH_LONG)
        val d = Toast.makeText(applicationContext,"สมัครเสร็จสิ้น.",Toast.LENGTH_LONG)

        OK.setOnClickListener(){
            if (this.user.text.toString() == "" || this.pass1.text.toString() == "" || this.pass2.text.toString() == ""){
                c.show()
            }
            else{
                if (this.user.text.toString() == this.pass1.text.toString() || this.user.text.toString() == this.pass1.text.toString()||
                    this.user.text.toString() == this.pass1.text.toString() && this.user.text.toString() == this.pass2.text.toString()){
                    a.show()
                }
                else
                    if (this.pass1.text.toString() == this.pass2.text.toString()){
                        d.show()
                    }
                    else{
                        b.show()
                    }
            }
        }

        Clear.setOnClickListener(){
            user.setText(null)
            pass1.setText(null)
            pass2.setText(null)
        }
    }
}