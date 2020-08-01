package com.aldreduser.tempgymapp

class Workout {
    lateinit var name: String
    var set:Int = 0
    var reps:Int = 0
    var weight:Double = 0.0

    var position:Int = 0
    lateinit var bodyCategory:String            //ie. upper front, upper back, lower body
}