package com.example.tut_01_kotlinbasics

class Tut_01 : Tut_01_parentClass() {  // to exetends another class in Kotlin
        companion object{

            @JvmStatic
            fun main(args: Array<String>){
                    println("Hello World")
            }

        }
}