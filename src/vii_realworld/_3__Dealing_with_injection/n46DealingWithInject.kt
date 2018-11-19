package vii_realworld._3__Dealing_with_injection

import util.TODO

fun todoTask46(): Nothing = TODO(
    """
        Task 46.

        IntelliJ will often convert fields on classes that depend on dependency injection to
        immutable field values initialized with null. This will obviously fail
    """
)

fun task46() {
    todoTask46()
    ConvertedLifecycleManagedJavaClass().foobar = SomeService()
}