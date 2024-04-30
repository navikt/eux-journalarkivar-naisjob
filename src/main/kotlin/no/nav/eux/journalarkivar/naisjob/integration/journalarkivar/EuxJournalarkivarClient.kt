package no.nav.eux.journalarkivar.naisjob.integration.journalarkivar

import io.github.oshai.kotlinlogging.KotlinLogging.logger
import no.nav.eux.journalarkivar.naisjob.integration.config.post
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.MediaType
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

@Component
class EuxJournalarkivarClient(
    @Value("\${arkivarprosess}")
    val arkivarprosess: String,
    @Value("\${endpoint.euxjournalarkivar}")
    val euxJournalarkivarUrl: String,
    val euxJournalarkivarRestTemplate: RestTemplate
) {

    val log = logger {}

    fun execute() {
        log.info { "execute: $arkivarprosess" }
        euxJournalarkivarRestTemplate
            .post()
            .uri("${euxJournalarkivarUrl}/api/v1/arkivarprosess/$arkivarprosess/execute")
            .contentType(APPLICATION_JSON)
            .accept(MediaType.ALL)
            .retrieve()
            .toBodilessEntity()
    }
}
