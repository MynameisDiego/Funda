package pe.edu.upc.GlucoCheck.presentation.paciente

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.TabLayout
import pe.edu.upc.GlucoCheck.R
import android.support.v7.app.AppCompatActivity
import pe.edu.upc.GlucoCheck.presentation.paciente.TreatmentPageAdapter3
import kotlinx.android.synthetic.main.doc_paciente.*;


class PacienteActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.doc_paciente)
        setSupportActionBar(toolbar2)

        configureTabLayout()
    }

    private fun configureTabLayout() {
        doc_paciente_tab.addTab(doc_paciente_tab.newTab().setText("Ficha de Datos"))
        doc_paciente_tab.addTab(doc_paciente_tab.newTab().setText("Historia Clínica"))
        doc_paciente_tab.addTab(doc_paciente_tab.newTab().setText("Consulta Medica"))
        doc_paciente_tab.addTab(doc_paciente_tab.newTab().setText("Reportes"))

        val adapter = TreatmentPageAdapter3(supportFragmentManager, doc_paciente_tab.tabCount)
        pager2.adapter = adapter

        pager2.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(doc_paciente_tab))
        doc_paciente_tab.addOnTabSelectedListener(object :
            TabLayout.OnTabSelectedListener {
            override fun onTabSelected(p0: TabLayout.Tab?) {
                if (p0 != null) {
                    pager2.currentItem = p0.position
                }
            }

            override fun onTabUnselected(p0: TabLayout.Tab?) {
            }

            override fun onTabReselected(p0: TabLayout.Tab?) {
            }
        })
    }



}