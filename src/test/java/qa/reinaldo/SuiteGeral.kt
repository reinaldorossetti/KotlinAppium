package qa.reinaldo

import org.junit.AfterClass
import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite::class)
@Suite.SuiteClasses(*[Runner::class])
object SuiteGeral {
    @AfterClass
    fun finalizar() {
        _core.Capabilities.Companion.finalizarAppiumDrivery()
    }
}