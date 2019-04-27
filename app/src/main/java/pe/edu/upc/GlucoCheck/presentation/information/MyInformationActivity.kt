package pe.edu.upc.GlucoCheck.presentation.information

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_proxcita.*
import pe.edu.upc.GlucoCheck.R
import kotlinx.android.synthetic.main.activity_information.*

class MyInformationActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information)

        cancel_btn3.setOnClickListener {
            this.finish()
        }


    }
}