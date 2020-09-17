class Duck(
    private val name: String,
    private val quack: () -> Unit // strategy injection here
) {
    fun quackName() {
        print("$name, ")
        quack()
    }
}