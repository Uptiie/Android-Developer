package com.patrickchow.anywherefitness.model

//Data class for the courses

data class CoursesModel(
    val id: Int,    //Id for the course
    val courseName: String,     //Name of the course
    val instructor_id: Int,     //Instructor's Id
    var time: Long     //The time of the course
)