package com.aldreduser.tempgymapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//todo: save the game when user closes the app. Or when user goes to another activity
//todo: make floating save button

class MainActivity : AppCompatActivity() {

    private val workouts = mutableListOf<Workout>()

    private val upperFrontBodyWorkouts = listOf<String>("Incline Dumbbell", "Decline Dumbbell", "Lower Abbs", "Tricep Pulldown", "Bicep Curl")
    private val upperBackBodyWorkouts = listOf<String>("Lat Pulldown", "Back Pullback", "Shoulder Raises", "Upper Abbs")
    private val lowerBodyWorkouts = listOf<String>("Leg Press", "Out Calf Raises", "In Calf Raises", "Leg Extension")
    private val workoutCategories = listOf<List<String>>(upperFrontBodyWorkouts, upperBackBodyWorkouts, lowerBodyWorkouts)

    private val workoutCategoriesNames = listOf<String>("Upper Front Body Workouts", "Upper Back Body Workouts", "Lower Body Workouts")

    private var inclineDumbbellName:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun storeDataInObjects() {
        for (item in 0 until workoutCategories.size) {
            //for each category
            val workoutObject = Workout()   //todo: this might be wrong
            workoutObject.bodyPartCategory = workoutCategoriesNames[item]       //adds category name

            for (j in 0 until workoutCategories[item].size) {
                //for each workout in the category
                workoutObject.name = workoutCategories[item][j]     //adds workout name   //todo: this syntax might be wrong
                var workoutReps = mutableListOf<Int>()
                var workoutWeight = mutableListOf<Double>() //todo: might have to convert it to double when getting input from the input text box
                //workoutObject.sets        //to do in the future
                for (i in 1..3) {
                    //for each set //NOTICE: assumes everything has 3 sets

                    //todo: workoutReps.add()       //user input
                    //todo: workoutWeight.add()     //user input
                }
                //todo: add workout to workouts listOf<>()
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



/*
fun loadAllData() {
        //load all the data

        val inclineDumbbellNameSP = this.getPreferences(Context.MODE_PRIVATE)
        inclineDumbbellName = inclineDumbbellNameSP.getString("numOfOrdersSPKey", "name").toString()


    }


fun save(){
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
                }}
 */
