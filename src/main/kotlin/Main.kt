fun main() {
    val ducks = listOf(
        Duck("Donald", ::simpleQuack),
        Duck("Duckanarchy", ::rockQuack)
    )

    ducks.forEach { it.quackName() }
}