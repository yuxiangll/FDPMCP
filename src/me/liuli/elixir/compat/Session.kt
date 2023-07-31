package me.liuli.elixir.compat

/**
 * the compat layer for [net.minecraft.util.Session]
 */
data class Session(val username: String, val uuid: String, val token: String, val type: String)
