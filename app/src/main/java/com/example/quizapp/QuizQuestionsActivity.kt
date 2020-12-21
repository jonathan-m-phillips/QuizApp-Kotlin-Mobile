package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_quiz_questions.*
import kotlin.math.log

class QuizQuestionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        val questionsList = Constants.getQuestions()
        // Logcat --> verbose --> Question to see how large the questionList ArrayList is
        Log.i("Questions Size", "${questionsList.size}")

        val currentPosition = 1
        val question: Question? = questionsList[currentPosition - 1]

        progress_bar.progress = currentPosition
        tv_progress.text = "$currentPosition" + "/" + progress_bar.max

        tv_question.text = question!!.question

        iv_image.setImageResource(question.image)

        tv_option_one.text = question.optionOne
        tv_option_two.text = question.optionTwo
        tv_option_three.text = question.optionThree
        tv_option_four.text = question.optionFour
    }
}