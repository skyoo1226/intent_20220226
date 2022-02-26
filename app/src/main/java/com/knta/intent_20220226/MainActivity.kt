package com.knta.intent_20220226

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //    멤버변수 : 코드 초반부 첫번째 { 에 바로 만드는 변수.
    val REQ_CODE_NICKNAME = 1000


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMoveToOther.setOnClickListener {

//            OtherActivity 화면으로 이동

            val myIntent =  Intent(this, OtherActivity::class.java)
            startActivity(myIntent)

        }

        btnSendMessage.setOnClickListener {

//            입력된 문구를 변수로 담아두자

            val inputMessage = edtMessage.text.toString()

//            ViewMessageActivity 화면으로 이동 + 입력한 메세지를 첨부

            val myIntent = Intent(this, ViewMessageActivity::class.java)

//            myIntent에, 데이터를 첨부하자.
            myIntent.putExtra("메세지", inputMessage)

            startActivity(myIntent)

        }

        btnEditNickname.setOnClickListener {

            val myIntent = Intent(this, EditNicknameActivity::class.java)
            startActivityForResult(myIntent, REQ_CODE_NICKNAME) // 1000 : 닉네임을 변경하러 간다. 표식으로 사용.

        }

        btnDial.setOnClickListener {

//            어디에 전화를 걸고싶은지? 폰번 저장
            val inputPhoneNum = edtPhoneNum.text.toString()

//            전화연결 정보 형태 (Uri)로, 폰번 가공.

            val myUri = Uri.parse("tel:${inputPhoneNum}") // 어디에 전화를 걸지 정보 가공. 띄어쓰기 없이.

//            전화 앱으로 화면 전환
            val myIntent = Intent( Intent.ACTION_DIAL, myUri )
            startActivity(myIntent)

        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

//        어떤 요청을 마치고 돌아온건지 확인. => 닉네임을 가지러 다녀온게 맞나?
        if (requestCode == REQ_CODE_NICKNAME) {

//            OK눌렀어야 반영. => RESULT_OK가 맞는가?
            if (resultCode == Activity.RESULT_OK) {

//                닉네임 요청 + OK 둘다 맞다.
//                첨부된 새 닉네임을 꺼내서 > 텍스트뷰에 반영

                val newNickname = data?.getStringExtra("nick")
                txtNickname.text = newNickname


            }

        }

    }

}
