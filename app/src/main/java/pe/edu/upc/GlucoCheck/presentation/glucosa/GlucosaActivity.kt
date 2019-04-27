package pe.edu.upc.GlucoCheck.presentation.glucosa

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_glucosa.*
import kotlinx.android.synthetic.main.activity_proxcita.*
import kotlinx.android.synthetic.main.activity_sign_up.*
import pe.edu.upc.GlucoCheck.R

class GlucosaActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_glucosa)

        button2.setOnClickListener {
            this.finish()
        }

    }

}
