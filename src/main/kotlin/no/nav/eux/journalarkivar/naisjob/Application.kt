package no.nav.eux.journalarkivar.naisjob

import no.nav.eux.journalarkivar.naisjob.integration.journalarkivar.EuxJournalarkivarClient
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Application(
    val client: EuxJournalarkivarClient
) : CommandLineRunner {

    override fun run(vararg args: String) {
        client.execute()
    }
}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
