package com.cursoandroid.fundamentosjunit

import org.junit.After
import org.junit.AfterClass
import org.junit.Assert.*
import org.junit.Before
import org.junit.BeforeClass

import org.junit.Test

class AssertionsUsersTest {

    private lateinit var boot : User

    //Para el caso de recursos más pesados, en lugar de crearlos en cada test, se pueden crear una
    // vez y reutilizarlos mediante el método @BeforeClass
    companion object{
        private lateinit var juan :User

        @BeforeClass @JvmStatic
        //se ejecuta una vez antes de que comience las pruebas
        fun setupCommon(){
            juan = User("Juan", 18, true)
            println("Before Class")
        }
        @AfterClass @JvmStatic
        fun tearDownCommon(){
            juan = User()
            println("After Class")
        }
    }


    @Before //se ejecuta antes de cada test
    fun setup(){
        boot = User("Bbit", 1, false)
        println("Before")
    }


    @After //se ejecuta despues de cada test
    fun tearDown(){
        boot = User()
        println("After")
    }

    @Test
    fun checkHumanTest() {
        val assertions = Assertions()
        assertFalse(assertions.checkHuman(boot))
        assertTrue(assertions.checkHuman(juan))
        println("checkHumanTest")
    }

    @Test
    fun checkNotNullUserTest(){
        assertNotNull(juan)
        println("checkNotNullUserTest")
    }

    @Test
    fun checkNotSameUsersTest(){
        assertNotSame(boot, juan)
        println("checkNotSameUsersTest")
    }

    @Test
    fun checkSameUsersTest() {
        val copyJuan = juan
        /* Assert same comprueba que sea e mismo objeto, en caso de que sean dos objetos distintos
         * con propiedades identicas, no los considera iguales ***********************************/
        assertSame(copyJuan, juan)
        println("checkSameUsersTest")
    }
}