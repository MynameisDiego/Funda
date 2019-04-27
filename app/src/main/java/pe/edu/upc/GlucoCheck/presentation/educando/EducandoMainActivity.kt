package pe.edu.upc.GlucoCheck.presentation.educando

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.TabLayout
import android.support.v7.app.AppCompatActivity;
import pe.edu.upc.GlucoCheck.R
import kotlinx.android.synthetic.main.educando_home.*;


class EducandoMainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.educando_home)
        setSupportActionBar(toolbar)

        configureTabLayout()
    }

    private fun configureTabLayout() {
        educando_tab.addTab(educando_tab.newTab().setText("Diabetes"))
        educando_tab.addTab(educando_tab.newTab().setText("Medicamentos"))
        educando_tab.addTab(educando_tab.newTab().setText("Preguntas Frecuentes"))

        val adapter = TreatmentPageAdapter(supportFragmentManager, educando_tab.tabCount)
        pager.adapter = adapter

        pager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(educando_tab))
        educando_tab.addOnTabSelectedListener(object :
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