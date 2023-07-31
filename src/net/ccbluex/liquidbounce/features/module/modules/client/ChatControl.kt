/*
 * FDPClient Hacked Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge by LiquidBounce.
 * https://github.com/SkidderMC/FDPClient/
 */
package net.ccbluex.liquidbounce.features.module.modules.client

import net.ccbluex.liquidbounce.features.module.Module
import net.ccbluex.liquidbounce.features.module.ModuleCategory
import net.ccbluex.liquidbounce.features.module.ModuleInfo
import net.ccbluex.liquidbounce.features.value.BoolValue

@ModuleInfo(name = "ChatControl", category = ModuleCategory.CLIENT, defaultOn = true)
object ChatControl : Module() {
    val chatLimitValue = BoolValue("NoChatLimit", true)
    val chatClearValue = BoolValue("NoChatClear", true)
    val chatCombineValue = BoolValue("ChatCombine", true)
    val fontChatValue = BoolValue("FontChat", false)
    val chatRectValue = BoolValue("ChatBackGround", false)
    val betterChatRectValue = BoolValue("BetterChatRect", false)
    val chatAnimValue = BoolValue("ChatAnimation", false)
}