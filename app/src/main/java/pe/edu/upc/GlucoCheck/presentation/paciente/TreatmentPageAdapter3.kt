package pe.edu.upc.GlucoCheck.presentation.paciente

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import pe.edu.upc.GlucoCheck.presentation.nuevo_paciente.fragments.FichaDatosFragment
import pe.edu.upc.GlucoCheck.presentation.nuevo_paciente.fragments.HistoriaClinicaFragment
import pe.edu.upc.GlucoCheck.presentation.paciente.fragments.P_CM


public class TreatmentPageAdapter3(fm: FragmentManager, private var tabCount: Int): FragmentPagerAdapter(fm) {

    override fun getItem(p0: Int): Fragment? {
        when (p0) {
            0 -> return FichaDatosFragment()
            1 -> return HistoriaClinicaFragment()
            else -> return null
        }
    }

    override fun getCount(): Int {
        return tabCount
    }

}