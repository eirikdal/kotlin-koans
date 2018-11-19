package vii_realworld._0__Immutability

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class N42ImmutableObjectTest {
    @Test fun immutableObject() {
        val immutableObject = task42("bar")

        assertEquals("bar", immutableObject.foo)
        assertEquals("bar", immutableObject.bar)
        assertNull(immutableObject.foobar)
    }
}
