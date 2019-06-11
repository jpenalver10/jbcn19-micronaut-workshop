package clubs.client;

import clubs.api.ClubsApi;
import io.micronaut.http.client.annotation.Client;

@Client("/")
public interface ClubsClient extends ClubsApi {
}
