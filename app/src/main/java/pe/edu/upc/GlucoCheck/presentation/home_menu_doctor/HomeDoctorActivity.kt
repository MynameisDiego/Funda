package pe.edu.upc.GlucoCheck.presentation.home_menu_doctor
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase
import pe.edu.upc.GlucoCheck.R
import pe.edu.upc.GlucoCheck.presentation.cita.CitaActivity
import pe.edu.upc.GlucoCheck.presentation.nuevo_paciente.NuevoPacienteActivity

class HomeDoctorActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.doc_nuevo_paciente)

    }



}