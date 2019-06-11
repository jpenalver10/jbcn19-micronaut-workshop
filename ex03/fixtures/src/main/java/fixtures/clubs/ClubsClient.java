package fixtures.clubs;

import io.micronaut.http.client.annotation.Client;

@Client("clubs")
public interface ClubsClient extends ClubsApi {}
