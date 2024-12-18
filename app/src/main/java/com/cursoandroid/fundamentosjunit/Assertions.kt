package com.cursoandroid.fundamentosjunit

class Assertions {
    private val user = User ("Neri", 32)
    private var location = "US"

    fun setLocation(location:String){
        this.location = location
    }

    fun getLuckyNumbers(): Array<Int>{
        return arrayOf(21,117)
    }

    fun getName():String{
        return user.name
    }

    fun checkHuman(user:User):Boolean{
        return user.ishuman
    }

    fun checkHuman(user:User?):Boolean?{
        if(user== null ) return null
        return user.ishuman
    }

    fun isAdult(user:User):Boolean{
        if(!user.ishuman) return true
        return if(location=="US"){
            user.age >= 21
        }else {
            user.age >= 18
        }
    }
}