package com.aldreduser.tempgymapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//todo: save the game when user closes the app. Or when user goes to another activity

class MainActivity : AppCompatActivity() {

    private var inclineDumbbellName:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    fun loadAllData() {
        //load all the data

        val inclineDumbbellNameSP = this.getPreferences(Context.MODE_PRIVATE)
        inclineDumbbellName = inclineDumbbellNameSP.getString("numOfOrdersSPKey", "name").toString()


    }

    fun saveAllData() {
        //save all the data

        //loop through the categories //todo: NOTICE: assumes everything has 3 categories
        //loop through the workouts (put them in lists to loop through them)
        //loop though the sets //todo: NOTICE: assumes everything has 3 sets



        for (i in 1..5){
            println(i)
        }

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


/*
category / workoutName
category / workoutName / set1 / reps
category / workoutName / set2 / reps
category / workoutName / set3 / reps
category / workoutName / set1 / weight
category / workoutName / set2 / weight
category / workoutName / set3 / weight

 */
