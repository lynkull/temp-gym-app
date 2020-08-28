package com.aldreduser.tempgymapp.supportingfunctions

import kotlinx.android.synthetic.main.lower_body_workouts.*
import kotlinx.android.synthetic.main.upper_back_workouts.*
import kotlinx.android.synthetic.main.upper_front_workouts.*

fun repsAndWeightInputToArrays(/*tempWorkoutReps = mutableListOf<Int>(),     tempWorkoutWeight = mutableListOf<Double>()*/) {
    //todo: put this function in another file (use parameters)
    //input goes into global variables of reps and weights
    //then it goes into Workout object properties through the storeDataInObjects() function


    var inclineDumbbellRepSet1try = R.....
    //Upper Front Workouts
    tempWorkoutReps.add( inclineDumbbellRepSet1.text.toString().toInt() )
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

    //Lower Body Workouts
    tempWorkoutReps.add( legPressRepsSet1.text.toString().toInt() )
    tempWorkoutWeight.add( legPressWeightSet1.text.toString().toDouble() )
    tempWorkoutReps.add( legPressRepsSet2.text.toString().toInt() )
    tempWorkoutWeight.add( legPressWeightSet2.text.toString().toDouble() )
    tempWorkoutReps.add( legPressRepsSet3.text.toString().toInt() )
    tempWorkoutWeight.add( legPressWeightSet3.text.toString().toDouble() )

    tempWorkoutReps.add( outCalfRaisesRepsSet1.text.toString().toInt() )
    tempWorkoutWeight.add( outCalfRaisesWeightSet1.text.toString().toDouble() )
    tempWorkoutReps.add( outCalfRaisesRepsSet2.text.toString().toInt() )
    tempWorkoutWeight.add( outCalfRaisesWeightSet2.text.toString().toDouble() )
    tempWorkoutReps.add( outCalfRaisesRepsSet3.text.toString().toInt() )
    tempWorkoutWeight.add( outCalfRaisesWeightSet3.text.toString().toDouble() )

    tempWorkoutReps.add( inCalfRaisesRepsSet1.text.toString().toInt() )
    tempWorkoutWeight.add( inCalfRaisesWeightSet1.text.toString().toDouble() )
    tempWorkoutReps.add( inCalfRaisesRepsSet2.text.toString().toInt() )
    tempWorkoutWeight.add( inCalfRaisesWeightSet2.text.toString().toDouble() )
    tempWorkoutReps.add( inCalfRaisesRepsSet3.text.toString().toInt() )
    tempWorkoutWeight.add( inCalfRaisesWeightSet3.text.toString().toDouble() )

    tempWorkoutReps.add( legExtensionRepsSet1.text.toString().toInt() )
    tempWorkoutWeight.add( legExtensionWeightSet1.text.toString().toDouble() )
    tempWorkoutReps.add( legExtensionRepsSet2.text.toString().toInt() )
    tempWorkoutWeight.add( legExtensionWeightSet2.text.toString().toDouble() )
    tempWorkoutReps.add( legExtensionRepsSet3.text.toString().toInt() )
    tempWorkoutWeight.add( legExtensionWeightSet3.text.toString().toDouble() )
}