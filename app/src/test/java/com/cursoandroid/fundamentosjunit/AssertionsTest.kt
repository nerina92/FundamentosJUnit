package com.cursoandroid.fundamentosjunit

import org.junit.Assert.*
import org.junit.Test
import kotlin.random.Random

class AssertionsTest{
    @Test
    fun getArrayTest(){
        val assertions = Assertions()
        val array = arrayOf(21,117)
        //val array = arrayOf(21,11)
        assertArrayEquals("Mensaje personalizado del error",array, assertions.getLuckyNumbers())    }

    @Test
    fun getNameTest(){
        val assertions = Assertions()
        val name = "Neri"
        val otherName = "Pepa"
        assertEquals(name, assertions.getName())
        assertNotEquals(otherName, assertions.getName())
    }

    @Test
    fun checkHumanTest(){
        val assertions = Assertions()
        val boot = User("Bbit", 1, false)
        val juan = User("Juan", 18, true)
        assertFalse(assertions.checkHuman(boot))
        assertTrue(assertions.checkHuman(juan))
    }

    @Test
    fun checkNullUserTest(){
        val user = null
        assertNull(user)
        val assertions = Assertions()
        assertNull(assertions.checkHuman(user))
    }
    @Test
    fun checkNotNullUserTest(){
        val user =  User("Juan", 18, true)
        assertNotNull(user)
        val assertions = Assertions()
        assertNotNull(assertions.checkHuman(user))
    }

    @Test
    fun checkNotSameUsersTest(){
        val bot = User("Bbit", 1, false)
        val juan = User("Juan", 18, true)
        assertNotSame(bot, juan)
    }

    @Test
    fun checkSameUsersTest() {
        val bot = User("Bbit", 1, false)
        val juan = User("Bbit", 1, false)
        val copyJuan = juan
        /* Assert same comprueba que sea e mismo objeto, en caso de que sean dos objetos distintos
         * con propiedades identicas, no los considera iguales ***********************************/
        assertSame(copyJuan, juan)
    }

    @Test(timeout = 1_000)
    fun getCitiesTest(){
        val cities = arrayOf("México", "Perú", "Argentina")
        Thread.sleep(Random.nextLong(200, 1_100))
        assertEquals(3, cities.size)
    }


}