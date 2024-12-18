package com.cursoandroid.fundamentosjunit

import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class AssertionsUsersAdultTest {

    private lateinit var juan : User
    private lateinit var bot : User

    //Uso de reglas para uso de herencia, mejor legibilidad, pruebas más complejas
    @get:Rule
    val locationESRule = LocationESRule()

    @Before //se ejecuta antes de cada test
    fun setup(){
        juan = User("Juan", 18, true)
        bot = User("Bbit", 1, false)
    }

    @After //se ejecuta despues de cada test
    fun tearDown(){
        juan = User()
        bot = User()
    }

    @Test
    fun isAdultTest() {
        /*val assertions = Assertions()
        assertions.setLocation("ES")
        assertTrue(assertions.isAdult(juan))
        assertTrue(assertions.isAdult(boot))*/
        assertEquals(true, locationESRule.assertions?.isAdult(juan))
        assertEquals(true, locationESRule.assertions?.isAdult(bot))

    }
}