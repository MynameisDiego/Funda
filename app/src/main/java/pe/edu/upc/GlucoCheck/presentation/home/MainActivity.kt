package pe.edu.upc.GlucoCheck.presentation.home

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_main.*
import pe.edu.upc.GlucoCheck.R
import pe.edu.upc.GlucoCheck.presentation.home_menu.HomeMenuActivity
import pe.edu.upc.GlucoCheck.presentation.sign_up.SignUpActivity


class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        login_button.setOnClickListener {
            val intent = Intent(this, HomeMenuActivity::class.java)
            startActivity(intent)
        }


        forgot_password.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }




    }
}
