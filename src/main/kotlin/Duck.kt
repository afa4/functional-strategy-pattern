/*
 * Strategy pattern:
 *
 * Class behavior is injected, so its possible to have
 * multiple instances of the same class with different
 * method implementations.
 *
 * Isn't necessary to create class inheritance to define
 * an specific logic to a specific instance.
 *
 * The algorithm varies independently from the 'client'
 * (class) that uses it
 */
class Duck(
    private val name: String,
    private val quack: () -> Unit // strategy injection here
) {
    fun quackName() {
        print("$name, ")
        quack()
    }
}