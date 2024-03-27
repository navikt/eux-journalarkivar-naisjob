package no.nav.eux.journalarkivar.naisjob

import io.github.oshai.kotlinlogging.KotlinLogging.logger
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Application : CommandLineRunner {

    val log = logger {}

    override fun run(vararg args: String?) {
        log.info { "hei verden!" }
    }
}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
