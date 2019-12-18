package sample

import kotlin.test.Test
import kotlin.test.assertTrue

class SampleTestsAndroid {
    @Test
    fun testMe() {
        assertTrue(Sample().checkMe() > 0)
    }
}