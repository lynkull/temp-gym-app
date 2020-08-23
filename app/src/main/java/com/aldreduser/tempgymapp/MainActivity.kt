package com.aldreduser.tempgymapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.upper_front_workouts.*

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

    // user input will be put here to then be added to the objects
    private var tempWorkoutReps = listOf
    private var tempWorkoutWeight

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun repsAndWeightInputToArrays() {
        //put this function in another file
        //input goes into global variables of reps and weights
        //then it goes into Workout object properties through the storeDataInObjects() function

         inclineDumbbellRepsSet1.text.toString()
    }

    fun storeDataInObjects() {
        //put this function in another file
        for (item in 0 until workoutCategories.size) {
            //for each category
            for (j in 0 until workoutCategories[item].size) {
                //for each workout in the category
                val workoutObject = Workout()   //todo: this might be wrong
                workoutObject.bodyPartCategory = workoutCategoriesNames[item]       //adds category names

                workoutObject.name = workoutCategories[item][j]     //adds workout name   //todo: this syntax might be wrong
                //workoutObject.sets        //to do in the future
                for (i in 1..3) {
                    //for each set //NOTICE: assumes everything has 3 sets

                    //todo: workoutObject.reps.add()         //user input
                    //todo: workoutObject.weight.add()       //user input

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
