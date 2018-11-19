package vii_realworld._2__Static

import junit.framework.Assert.assertEquals
import org.junit.Test
import kotlin.reflect.full.memberProperties

class N45RefactoringCompanion {
    @Test fun refactoringCompanion() {
        todoTask45()
        assertEquals("foobar", KotlinClassWithCompanionObject().doSomething())
        assertEquals(KotlinClassWithCompanionObject.Companion::class.memberProperties.size, 0)
        assertEquals(KotlinClassWithCompanionObject::class.memberProperties.size, 0)
    }
}
