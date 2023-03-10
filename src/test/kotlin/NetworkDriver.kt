import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

// SINGLETON: Many instances of the same class
/* For create a Singleton is better to create an object rather than a class*/
object NetworkDriver {
    init {
        println("Initializing: $this")
    }

    fun log(): NetworkDriver = apply { println("Network Driver: $this") }
}

class SingletonTest {
    @Test
    fun testSingleton() {
        println("Start testing")
        val networkDriver1 = NetworkDriver.log()
        val networkDriver2 = NetworkDriver.log()

        Assertions.assertThat(networkDriver1).isSameAs(NetworkDriver)
        Assertions.assertThat(networkDriver2).isSameAs(NetworkDriver)
    }
}