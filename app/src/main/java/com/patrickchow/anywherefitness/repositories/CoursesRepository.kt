package com.patrickchow.anywherefitness.repositories

import com.patrickchow.anywherefitness.data.courseId
import com.patrickchow.anywherefitness.data.courseName
import com.patrickchow.anywherefitness.data.instructor_id
import com.patrickchow.anywherefitness.data.time
import com.patrickchow.anywherefitness.model.CoursesModel

//Repository for the courses

class CoursesRepository {
    companion object{
        var coursesList = mutableListOf<CoursesModel>()
        fun createCoursesList(){
            for(i in 0 until courseName.size){
                coursesList.add(CoursesModel(courseId[i], courseName[i],
                                            instructor_id[i], time[i]))
            }
        }
    }
}
