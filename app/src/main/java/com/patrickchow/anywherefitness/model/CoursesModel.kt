package com.patrickchow.anywherefitness.model

import android.widget.ImageView

//Data class for the courses

data class CoursesModel(
    val id: Int,    //Id for the course
    val courseName: String,     //Name of the course
    val benefits: String,
    val instructor_id: Int,     //Instructor's Id
    var time: String,     //The time of the course
    val image: Int //Image of the course
)