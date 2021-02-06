package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    fun add_1(v: View) {

        try {
            val add1_string = arg1.text.toString()
            var add1: Int = Integer.parseInt(add1_string)
            val add2_string = arg2.text.toString()
            var add2: Int = Integer.parseInt(add2_string)
            var add = add1 + add2
            answer.text = "$add"


        } catch (e: NumberFormatException){
            answer.text = "Input Error"
            return
        }

    }

    fun subtr_2(v: View) {
        try {
            val subtr1_string = arg1.text.toString()
            var subtr1: Int = Integer.parseInt(subtr1_string)
            val subtr2_string = arg2.text.toString()
            var subtr2: Int = Integer.parseInt(subtr2_string)

            var subtr = subtr1 - subtr2
            answer.text = "$subtr"

        }catch (e: NumberFormatException){
            answer.text = "Input Error"
            return
        }



    }

    fun mul_3(v: View) {
        try {
            val mul1_string = arg1.text.toString()
            var mul1: Int = Integer.parseInt(mul1_string)
            val mul2_string = arg2.text.toString()
            var mul2: Int = Integer.parseInt(mul2_string)

            var mul = mul1 * mul2
            answer.text = "$mul"

        } catch (e: NumberFormatException){
            answer.text = "Input Error"
            return
        }

    }

    fun divide_4(v:View) {

        try {
            val divide1_string = arg1.text.toString()
            var divide1: Int = Integer.parseInt(divide1_string)
            val divide2_string = arg2.text.toString()
            var divide2: Int = Integer.parseInt(divide2_string)

            if (divide2 == 0){
                answer.text = "Div by zero"
            } else {
                var divide = divide1 / divide2
                answer.text = "$divide"

            }
        } catch (e: NumberFormatException){
            answer.text = "Input Error"
            return
        }

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* val an1_string = arg1.text.toString()
         var an1: Int = Integer.parseInt(an1_string)
         val an2_string = arg2.text.toString()
         var an2: Int = Integer.parseInt(an2_string)

         val an2_string = answer.text.toString()
         var an2: Int = Integer.parseInt(an2_string)



             if ( an1 % 1  == 0 && an2 % 1  == 0) {
                 answer.setText("Input Error")
             } else {

             }*/
        val d1_1 = arg1.text.toString()

        val d2_2 = arg2.text.toString()


        /* if (d1_1 == "" && d2_2 == ""){
             answer.text = "Input Error"
         }*/


        add.setOnClickListener(::add_1)
        subtr.setOnClickListener(::subtr_2)
        mul.setOnClickListener(::mul_3)
        divide.setOnClickListener(::divide_4)








    }
}

