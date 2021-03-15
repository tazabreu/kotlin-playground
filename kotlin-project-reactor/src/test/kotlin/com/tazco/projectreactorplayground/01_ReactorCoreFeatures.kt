package com.tazco.projectreactorplayground

import org.junit.jupiter.api.Test
import reactor.core.publisher.Flux
import reactor.test.StepVerifier

class `01_ReactorCoreFeatures` {
    @Test
    fun `hello world!`() {
        StepVerifier.create(Flux.just(1, 2, 3, 4, 5))
                .expectNext(1)
                .expectNext(2)
                .expectNext(3)
                .expectNext(4)
                .expectNext(5)
                .expectComplete()
                .verify()
    }
}