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
            //문자전송 활용처: 지정된 번호로 문자에 맞게 보내면 그걸로 본인 인증,

        }

        btn_Naver.setOnClickListener {

            val phoneNumber = EDT_Phone.text.toString()

            //인텐트는 항상 어디론가 향해있어야 함, URI로 알려줘라
            val mUrii = Uri.parse("https://naver.com")//띄어쓰기는 오류 원인
            //웹페이지로 바로 보내는 링크
            val intent = Intent(Intent.ACTION_VIEW, mUrii)

            startActivity(intent)
            //광고 링크 + 앱 다운로드 광고 링크도 이쪽으로 많이 해결
            // 사이트를 하나 만들고, 거기다가 마켓 링크 넣기
            // 안드로이드 / 아이폰 유저 편하게 나누기
            // 약관 보여줄 때, PDF하나 만들어놓고 전문 보기 -> 그 파일 보여주기

        }

        btn_Kakao.setOnClickListener {

            val phoneNumber = EDT_Phone.text.toString()

            //인텐트는 항상 어디론가 향해있어야 함, URI로 알려줘라
            val mUrii = Uri.parse("market://details?id=com.kakao.talk")//띄어쓰기는 오류 원인

            // PlayStore로 바로 보내주는 링크
            val intent = Intent(Intent.ACTION_VIEW, mUrii)

            startActivity(intent)

            //업데이트 안하면 못 하게 강제한 후, 업데이트하라고 마켓으로 보낼 때

        }

        //이외에도 메일 앱으로 링크주기, 지도 앱으로 링크 주기 등 다양함




    }
}