package com.aldreduser.tempgymapp

class Workout {

    //companion object {
        lateinit var name: String
        //var sets: Int = 0
        //var numOfWorkouts = 0
        var reps = mutableListOf<Int>()
        var weight = mutableListOf<Double>() //todo: might have to convert it to double when getting input from the input text box

        lateinit var bodyPartCategory: String            //ie. upper front, upper back, lower body
    //}
}