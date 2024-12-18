package com.cursoandroid.fundamentosjunit

import junit.framework.Assert.assertEquals
import org.junit.AfterClass
import org.junit.BeforeClass
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

//Con RunWith nos permite ejecutar la clase como un test
@RunWith(value = Parameterized::class)
class ParameterizedTest(var currentValue: Boolean, var currentUser: User) {
    /*@get:Rule
    val locationESRule = LocationESRule()*///opción 1, con la regla

    companion object {
        var assertions:Assertions?=null

        @BeforeClass @JvmStatic//opción 2, con BeforeClass
        fun setupCommon() {
            assertions = Assertions()
        }

        @AfterClass
        @JvmStatic
        fun tearDownCommon() {
            assertions = null
        }

        @Parameterized.Parameters @JvmStatic
        fun getUsersUS() = arrayOf(
            arrayOf(false,  User("Pedro",12)),
            arrayOf(true,User("Clara", 34)),
            arrayOf(false, User("Juan", 18)),
            arrayOf(true, User("Bot21", 4, false))
        )

    }

    @Test
    fun isAdultTest(){
        //assertEquals(currentValue, locationESRule.assertions?.isAdult(currentUser))//si uso opcion 1
        assertEquals(currentValue, assertions?.isAdult(currentUser))
    }
}