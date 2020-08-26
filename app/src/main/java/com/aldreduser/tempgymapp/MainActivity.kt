package com.aldreduser.tempgymapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.upper_back_workouts.*
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
    private var tempWorkoutReps = mutableListOf<Int>()
    private var tempWorkoutWeight = mutableListOf<Double>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun repsAndWeightInputToArrays() {
        //todo: put this function in another file
        //input goes into global variables of reps and weights
        //then it goes into Workout object properties through the storeDataInObjects() function

        //Upper Front Workouts
        tempWorkoutReps.add( inclineDumbbellRepsSet1.text.toString().toInt() )
        tempWorkoutWeight.add( inclineDumbbellWeightSet1.text.toString().toDouble() )
        tempWorkoutReps.add( inclineDumbbellRepsSet2.text.toString().toInt() )
        tempWorkoutWeight.add( inclineDumbbellWeightSet2.text.toString().toDouble() )
        tempWorkoutReps.add( inclineDumbbellRepsSet3.text.toString().toInt() )
        tempWorkoutWeight.add( inclineDumbbellWeightSet3.text.toString().toDouble() )

        tempWorkoutReps.add( declineDumbbellRepsSet1.text.toString().toInt() )
        tempWorkoutWeight.add( declineDumbbellWeightSet1.text.toString().toDouble() )
        tempWorkoutReps.add( declineDumbbellRepsSet2.text.toString().toInt() )
        tempWorkoutWeight.add( declineDumbbellWeightSet2.text.toString().toDouble() )
        tempWorkoutReps.add( declineDumbbellRepsSet3.text.toString().toInt() )
        tempWorkoutWeight.add( declineDumbbellWeightSet3.text.toString().toDouble() )

        tempWorkoutReps.add( lowerAbbsRepsSet1.text.toString().toInt() )
        tempWorkoutWeight.add( lowerAbbsWeightSet1.text.toString().toDouble() )
        tempWorkoutReps.add( lowerAbbsRepsSet2.text.toString().toInt() )
        tempWorkoutWeight.add( lowerAbbsWeightSet2.text.toString().toDouble() )
        tempWorkoutReps.add( lowerAbbsRepsSet3.text.toString().toInt() )
        tempWorkoutWeight.add( lowerAbbsWeightSet3.text.toString().toDouble() )

        tempWorkoutReps.add( tricepPulldownRepsSet1.text.toString().toInt() )
        tempWorkoutWeight.add( tricepPulldownWeightSet1.text.toString().toDouble() )
        tempWorkoutReps.add( tricepPulldownRepsSet2.text.toString().toInt() )
        tempWorkoutWeight.add( tricepPulldownWeightSet2.text.toString().toDouble() )
        tempWorkoutReps.add( tricepPulldownRepsSet3.text.toString().toInt() )
        tempWorkoutWeight.add( tricepPulldownWeightSet3.text.toString().toDouble() )

        tempWorkoutReps.add( bicepCurlRepsSet1.text.toString().toInt() )
        tempWorkoutWeight.add( bicepCurlWeightSet1.text.toString().toDouble() )
        tempWorkoutReps.add( bicepCurlRepsSet2.text.toString().toInt() )
        tempWorkoutWeight.add( bicepCurlWeightSet2.text.toString().toDouble() )
        tempWorkoutReps.add( bicepCurlRepsSet3.text.toString().toInt() )
        tempWorkoutWeight.add( bicepCurlWeightSet3.text.toString().toDouble() )

        //Upper Back Workouts
        tempWorkoutReps.add( latPulldownRepsSet1.text.toString().toInt() )
        tempWorkoutWeight.add( latPulldownWeightSet1.text.toString().toDouble() )
        tempWorkoutReps.add( latPulldownRepsSet2.text.toString().toInt() )
        tempWorkoutWeight.add( latPulldownWeightSet2.text.toString().toDouble() )
        tempWorkoutReps.add( latPulldownRepsSet3.text.toString().toInt() )
        tempWorkoutWeight.add( latPulldownWeightSet3.text.toString().toDouble() )

        tempWorkoutReps.add( backPullbackRepsSet1.text.toString().toInt() )
        tempWorkoutWeight.add( backPullbackWeightSet1.text.toString().toDouble() )
        tempWorkoutReps.add( backPullbackRepsSet2.text.toString().toInt() )
        tempWorkoutWeight.add( backPullbackWeightSet2.text.toString().toDouble() )
        tempWorkoutReps.add( backPullbackRepsSet3.text.toString().toInt() )
        tempWorkoutWeight.add( backPullbackWeightSet3.text.toString().toDouble() )

        tempWorkoutReps.add( shoulderRaisesRepsSet1.text.toString().toInt() )
        tempWorkoutWeight.add( shoulderRaisesWeightSet1.text.toString().toDouble() )
        tempWorkoutReps.add( shoulderRaisesRepsSet2.text.toString().toInt() )
        tempWorkoutWeight.add( shoulderRaisesWeightSet2.text.toString().toDouble() )
        tempWorkoutReps.add( shoulderRaisesRepsSet3.text.toString().toInt() )
        tempWorkoutWeight.add( shoulderRaisesWeightSet3.text.toString().toDouble() )

        tempWorkoutReps.add( upperAbbsRepsSet1.text.toString().toInt() )
        tempWorkoutWeight.add( upperAbbsWeightSet1.text.toString().toDouble() )
        tempWorkoutReps.add( upperAbbsRepsSet2.text.toString().toInt() )
        tempWorkoutWeight.add( upperAbbsWeightSet2.text.toString().toDouble() )
        tempWorkoutReps.add( upperAbbsRepsSet3.text.toString().toInt() )
        tempWorkoutWeight.add( upperAbbsWeightSet3.text.toString().toDouble() )

        //todo: keep this going with the other workouts



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
                    // NOTICE: workouts have to be in the same order as in repsAndWeightInputToArrays()

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
