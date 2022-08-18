package com.jillesvangurp.ktsearch

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import kotlin.test.Test
import kotlin.time.Duration.Companion.hours

class IlmTest: SearchTestBase()  {
    @Test
    fun shouldSetUpIlmPolicy() = coTest {
        onlyOn("ilm only works on elasticsearch",
            SearchEngineVariant.ES7,
            SearchEngineVariant.ES8) {
            client.setIlmPolicy("my-ilm") {
                hot {
                    actions {
                        rollOver(2)
                    }
                }
                warm {
                    minAge(24.hours)
                    actions {
                        shrink(1)
                        forceMerge(1)
                    }
                }
            }
            client.getIlmPolicy("my-ilm").let { p ->
                println(p)

            }
            client.deleteIlmPolicy("my-ilm")
            shouldThrow<RestException> {
                client.getIlmPolicy("my-ilm")
            }.status shouldBe 404
        }
    }
}