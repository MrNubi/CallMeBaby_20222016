package com.beyond.callmebaby_20222016

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_Dial.setOnClickListener {

            val phoneNumber = EDT_Phone.text.toString()

            //인텐트는 항상 어디론가 향해있어야 함, URI로 알려줘라
            val mUrii = Uri.parse("tel:$phoneNumber")//띄어쓰기는 오류 원인

            val intent = Intent(Intent.ACTION_DIAL, mUrii)

            startActivity(intent)

        }

        btn_CALL.setOnClickListener {

            val phoneNumber = EDT_Phone.text.toString()

            //인텐트는 항상 어디론가 향해있어야 함, URI로 알려줘라
            val mUrii = Uri.parse("tel:$phoneNumber")//띄어쓰기는 오류 원인

            val intent = Intent(Intent.ACTION_CALL, mUrii)

            startActivity(intent)

        }

        btn_Message.setOnClickListener {

            val phoneNumber = EDT_Phone.text.toString()//EDT_SMS
            val EDT_SMS = EDT_SMS.text.toString()

            //인텐트는 항상 어디론가 향해있어야 함, URI로 알려줘라
            val mUrii = Uri.parse("smsto:$phoneNumber")//띄어쓰기는 오류 원인

            val intent = Intent(Intent.ACTION_SENDTO, mUrii)

            intent.putExtra("sms_body", EDT_SMS)
            //이름 고정, 우리가 컨트롤 불가, 쟤내가 만든대로 붙여줘야됨

            startActivity(intent)

        }



    }
}