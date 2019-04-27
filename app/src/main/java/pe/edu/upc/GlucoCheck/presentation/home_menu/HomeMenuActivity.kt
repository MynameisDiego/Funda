package pe.edu.upc.GlucoCheck.presentation.home_menu
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase
import pe.edu.upc.GlucoCheck.R
import pe.edu.upc.GlucoCheck.presentation.cita.CitaActivity
import pe.edu.upc.GlucoCheck.presentation.sign_up.SignUpActivity
import pe.edu.upc.GlucoCheck.presentation.educando.EducandoMainActivity
import pe.edu.upc.GlucoCheck.presentation.information.MyInformationActivity
import pe.edu.upc.GlucoCheck.presentation.nuevo_paciente.NuevoPacienteActivity
import pe.edu.upc.GlucoCheck.presentation.glucosa.GlucosaActivity
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.ValueEventListener
import android.support.v4.app.FragmentActivity
import com.google.android.gms.tasks.OnSuccessListener
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.firestore.QuerySnapshot
import pe.edu.upc.GlucoCheck.presentation.reporte.ReporteActivity


class HomeMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val iv_click_me = findViewById(R.id.imageView3) as ImageView
        val iv_click_me2 = findViewById(R.id.imageView7) as ImageView
        val iv_click_me3 = findViewById(R.id.imageView4) as ImageView
        val iv_click_me4 = findViewById(R.id.imageView2) as ImageView
        val iv_click_me5 = findViewById(R.id.imageView5) as ImageView
        val iv_click_me6 = findViewById(R.id.imageView8) as ImageView
        val iv_click_me7 = findViewById(R.id.imageView6) as ImageView

        iv_click_me.setOnClickListener() {
            // your code to perform when the user clicks on the ImageView
            val intent = Intent(this, CitaActivity::class.java)
            startActivity(intent)
        }

        iv_click_me2.setOnClickListener() {
            // your code to perform when the user clicks on the ImageView
            val intent = Intent(this, EducandoMainActivity::class.java)
            startActivity(intent)
        }

        iv_click_me3.setOnClickListener() {
            // your code to perform when the user clicks on the ImageView
            val intent = Intent(this, MyInformationActivity::class.java)
            startActivity(intent)
        }

        iv_click_me4.setOnClickListener() {
            // your code to perform when the user clicks on the ImageView
            val intent = Intent(this, NuevoPacienteActivity::class.java)
            startActivity(intent)
        }

        iv_click_me5.setOnClickListener() {
            // your code to perform when the user clicks on the ImageView
            val intent = Intent(this, GlucosaActivity::class.java)
            startActivity(intent)
        }

        iv_click_me6.setOnClickListener() {
            // your code to perform when the user clicks on the ImageView
            val intent = Intent(Intent.ACTION_CALL);
            intent.data = Uri.parse("tel:" + "991529773")
            startActivity(intent)
        }

        iv_click_me7.setOnClickListener() {
            // your code to perform when the user clicks on the ImageView
            val intent = Intent(this, ReporteActivity::class.java)
            startActivity(intent)
        }


        /*cancel_btn2.setOnClickListener {
                  this.finish()
              }*/











    }
}