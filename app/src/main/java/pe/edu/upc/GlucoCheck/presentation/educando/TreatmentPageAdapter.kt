package pe.edu.upc.GlucoCheck.presentation.educando

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import pe.edu.upc.GlucoCheck.presentation.educando.fragments.ExcercisesFragment
import pe.edu.upc.GlucoCheck.presentation.educando.fragments.FeedingFragment
import pe.edu.upc.GlucoCheck.presentation.educando.fragments.MedicineFragment

public class TreatmentPageAdapter(fm: FragmentManager, private var tabCount: Int): FragmentPagerAdapter(fm) {

    override fun getItem(p0: Int): Fragment? {
        when (p0) {
            0 -> return MedicineFragment()
            1 -> return FeedingFragment()
            2 -> return ExcercisesFragment()
            else -> return null
        }
    }

    override fun getCount(): Int {
        return tabCount
    }

}