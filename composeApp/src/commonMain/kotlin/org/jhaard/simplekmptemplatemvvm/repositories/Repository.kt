package org.jhaard.simplekmptemplatemvvm.repositories

import io.ktor.client.HttpClient

/**
 * Repository class for requests.
 * @param client The client to use via Koin.
 *
 * Close the client when not used.
 */
class Repository(private val client: HttpClient) {

}