package com.aldreduser.tempgymapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//todo: save the game when user closes the app. Or when user goes to another activity

class MainActivity : AppCompatActivity() {

    private val upperFrontBodyWorkouts = listOf<String>("Incline Dumbbell", "Decline Dumbbell", "Lower Abbs", "Tricep Pulldown", "Bicep Curl")
    private val upperBackBodyWorkouts = listOf<String>("Lat Pulldown", "Back Pullback", "Shoulder Raises", "Upper Abbs")
    private val lowerBodyWorkouts = listOf<String>("Leg Press", "Out Calf Raises", "In Calf Raises", "Leg Extension")

    private val workoutCategories = listOf<List<String>>(upperFrontBodyWorkouts, upperBackBodyWorkouts, lowerBodyWorkouts)

    private var inclineDumbbellName:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //todo: button to save all


    fun loadAllData() {
        //load all the data

        val inclineDumbbellNameSP = this.getPreferences(Context.MODE_PRIVATE)
        inclineDumbbellName = inclineDumbbellNameSP.getString("numOfOrdersSPKey", "name").toString()


    }

    fun saveAllData() {
        //save all the data

        //loop through the categories
        //loop through the workouts (put them in lists to loop through them)
        //loop though the sets //todo: NOTICE: assumes everything has 3 sets



        for (item in 1..workoutCategories.size) {
            //for each category
            //this should do 3 loops, but it might be wrong (ie. not 3)

            var category:Int = 0

            for (item in 1..workoutCategories[category].size) {
                //for each workout
                //for each workout in the category
                category++

                for (i in 1..3) {
                    //for each set
                    val repsSP = this.getPreferences(Context.MODE_PRIVATE)
                    with(repsSP.edit()) {
                        putString("workout name", /*reps*/)
                        commit()
                    }
                    val weightSP = this.getPreferences(Context.MODE_PRIVATE)
                    with(weightSP.edit()) {
                        putString("workout name", /*weight*/)
                        commit()
                    }
                }
            }
            

        }

    }
}


/*
category / workoutName
category / workoutName / set1 / reps
category / workoutName / set2 / reps
category / workoutName / set3 / reps
category / workoutName / set1 / weight
category / workoutName / set2 / weight
category / workoutName / set3 / weight

 */
