package pe.edu.upc.GlucoCheck.presentation.nuevo_paciente

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.TabLayout
import android.support.v7.app.AppCompatActivity;
import pe.edu.upc.GlucoCheck.R
import kotlinx.android.synthetic.main.doc_nuevo_paciente.*;

class NuevoPacienteActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.doc_nuevo_paciente)
        setSupportActionBar(toolbar)

        configureTabLayout()
    }

    private fun configureTabLayout() {
        doc_nuevopaciente_tab.addTab(doc_nuevopaciente_tab.newTab().setText("Ficha de Datos"))
        doc_nuevopaciente_tab.addTab(doc_nuevopaciente_tab.newTab().setText("Historia Clínica"))

        val adapter = TreatmentPageAdapter2(supportFragmentManager, doc_nuevopaciente_tab.tabCount)
        pager.adapter = adapter

        pager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(doc_nuevopaciente_tab))
        doc_nuevopaciente_tab.addOnTabSelectedListener(object :
            TabLayout.OnTabSelectedListener {
            override fun onTabSelected(p0: TabLayout.Tab?) {
                if (p0 != null) {
                    pager.currentItem = p0.position
                }
            }

            override fun onTabUnselected(p0: TabLayout.Tab?) {
            }

            override fun onTabReselected(p0: TabLayout.Tab?) {
            }
        })
    }



}