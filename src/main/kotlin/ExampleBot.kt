import discord4j.core.DiscordClientBuilder
import discord4j.core.GatewayDiscordClient

fun main() {
    val client: GatewayDiscordClient = DiscordClientBuilder.create(System.getenv("TOKEN"))
        .build()
        .login()
        .block()!!
    client.onDisconnect().block()
}