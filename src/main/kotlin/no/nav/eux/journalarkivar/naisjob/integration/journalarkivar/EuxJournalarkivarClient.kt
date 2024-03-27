package no.nav.eux.journalarkivar.naisjob.integration.journalarkivar

import no.nav.eux.journalarkivar.naisjob.integration.config.post
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.MediaType
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

@Component
class EuxJournalarkivarClient(
    @Value("\${endpoint.euxjournalarkivar}")
    val euxJournalarkivarUrl: String,
    val euxJournalarkivarRestTemplate: RestTemplate
) {

    fun ferdigstillJournalposter() {
        euxJournalarkivarRestTemplate
            .post()
            .uri("${euxJournalarkivarUrl}/api/v1/ferdigstillJournalposter")
            .contentType(APPLICATION_JSON)
            .accept(MediaType.ALL)
            .body("{}")
            .retrieve()
            .toBodilessEntity()
    }
}