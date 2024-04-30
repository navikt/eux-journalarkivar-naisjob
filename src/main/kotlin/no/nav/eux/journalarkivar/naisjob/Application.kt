package no.nav.eux.journalarkivar.naisjob

import io.github.oshai.kotlinlogging.KotlinLogging.logger
import no.nav.eux.journalarkivar.naisjob.integration.journalarkivar.EuxJournalarkivarClient
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Application(
    val client: EuxJournalarkivarClient
) : CommandLineRunner {

    val log = logger {}

    override fun run(vararg args: String?) {
        log.info { "ferdigstiller journalposter.." }
        client.ferdigstillJournalposter()
        log.info { "journalposter ferdigstilt" }
        client.execute()
    }
}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
