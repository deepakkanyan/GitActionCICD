package com.lib.gitactioncicd.logic

import org.junit.Assert
import org.junit.Test


class MyLogicTest {

    @Test
    fun addTwoNumber() {
      val test = MyLogic()
      val a = test.addTwoNumber(1,4)
      Assert.assertEquals(a,5)
    }

    @Test
    fun addTwoNumber_2() {
        val test = MyLogic()
        val a = test.addTwoNumber(1,4)
        Assert.assertEquals(a,3)
    }
}