package com.testing.a.thing.gplib

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class LibraryTest {
    @Test fun someLibraryMethodReturnsTrue() {
        val classUnderTest = GPLibrary()
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'")
    }

    @Test fun anotherLibraryMethodTest() {
        assertEquals(GPLibrary().anotherLibraryMethod(), "Yep, worked.")
    }
}
