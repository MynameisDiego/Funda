package pe.edu.upc.GlucoCheck.presentation.cita
import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_proxcita.*
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_up.*
import pe.edu.upc.GlucoCheck.R
import android.content.Context
import pe.edu.upc.GlucoCheck.presentation.home_menu.HomeMenuActivity
import pe.edu.upc.GlucoCheck.presentation.sign_up.SignUpActivity

class CitaActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proxcita)

        val pack = "com.google.android.talk"

        cancel_btn2.setOnClickListener {
            launchApp(pack)
        }



        cancel_btnsalir.setOnClickListener {
            this.finish()
        }

    }

    // Custom method to launch an app
    private fun launchApp(packageName: String) {
        // Get an instance of PackageManager
        val pm = applicationContext.packageManager

        // Initialize a new Intent
        val intent:Intent? = pm.getLaunchIntentForPackage(packageName)

        // Add category to intent
        intent?.addCategory(Intent.CATEGORY_LAUNCHER)

        // If intent is not null then launch the app
        if(intent!=null){
            applicationContext.startActivity(intent)
        }else{
            toast("Intent null.")
        }
    }


}
fun Context.toast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}