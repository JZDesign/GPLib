package com.testing.a.thing.gplib

import testing.`this`.gplib.Library
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class LibraryTest {
    @Test fun someLibraryMethodReturnsTrue() {
        val classUnderTest = Library()
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'")
    }

    @Test fun anotherLibraryMethodTest() {
        assertEquals(Library().anotherLibraryMethod(), "Yep, worked.")
    }
}
