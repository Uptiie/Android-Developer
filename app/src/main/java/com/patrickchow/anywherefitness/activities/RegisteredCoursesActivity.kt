package com.patrickchow.anywherefitness.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.patrickchow.anywherefitness.R
import com.patrickchow.anywherefitness.adapters.CoursesRecyclerAdapter
import com.patrickchow.anywherefitness.model.CoursesModel
import kotlinx.android.synthetic.main.activity_courses.*
import kotlinx.android.synthetic.main.activity_registered_courses.*

class RegisteredCoursesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registered_courses)

        if(registeredCourses.size != 0)
            tv_no_registered_courses.visibility = TextView.INVISIBLE

        //Used to get CoursesActivity Context so that a Toast/Alert Dialog can be run

        rv_registered_courses.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@RegisteredCoursesActivity)

            //A context is needed because i wanted a Toast/Alert Dialog to be shown
            //Show is here to prevent the register image view from showing
            adapter = CoursesRecyclerAdapter(context,false, registeredCourses)
        }
    }

    companion object{
        var registeredCourses = mutableListOf<CoursesModel>()
        val context = this
    }
}
