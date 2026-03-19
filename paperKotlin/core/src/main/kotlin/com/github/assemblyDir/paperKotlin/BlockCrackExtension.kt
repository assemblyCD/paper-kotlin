package com.github.assemblyDir.paperKotlin

import org.bukkit.Location
import org.bukkit.entity.Entity
import org.bukkit.entity.Player

/**
 * Wrapper for [Player.sendBlockDamage]
 *
 * @receiver [Player] instance
 * @param location [Location] of the block
 * @param progress Block damage progress
 */
fun Player.blockCrack(
    location: Location,
    progress: Float,
) { sendBlockDamage(location, progress, this) }

/**
 * Wrapper for [Player.sendBlockDamage]
 *
 * @receiver [Player] instance
 * @param location [Location] of the block
 * @param progress Block damage progress
 * @param source [Entity] that causes the damage
 */
fun Player.blockCrack(
    location: Location,
    progress: Float,
    source: Entity,
) { sendBlockDamage(location, progress, source) }

/**
 * Wrapper for [Player.sendBlockDamage]
 *
 * @receiver [Player] instance
 * @param location [Location] of the block
 * @param progress Block damage progress
 * @param sourceId Entity ID that causes the damage
 */
fun Player.blockCrack(
    location: Location,
    progress: Float,
    sourceId: Int,
) { sendBlockDamage(location, progress, sourceId) }

/**
 * Sends block damage to multiple players.
 *
 * @receiver Iterable of [Player] instances
 * @param location [Location] of the block
 * @param progress Block damage progress
 */
fun Iterable<Player>.blockCrack(
    location: Location,
    progress: Float,
) { for (player in this) player.sendBlockDamage(location, progress, player) }

/**
 * Sends block damage to multiple players.
 *
 * @receiver Iterable of [Player] instances
 * @param location [Location] of the block
 * @param progress Block damage progress
 * @param source [Entity] that causes the damage
 */
fun Iterable<Player>.blockCrack(
    location: Location,
    progress: Float,
    source: Entity,
) { for (player in this) player.sendBlockDamage(location, progress, source) }

/**
 * Sends block damage to multiple players.
 *
 * @receiver Iterable of [Player] instances
 * @param location [Location] of the block
 * @param progress Block damage progress
 * @param sourceId Entity ID that causes the damage
 */
fun Iterable<Player>.blockCrack(
    location: Location,
    progress: Float,
    sourceId: Int,
) { for (player in this) player.sendBlockDamage(location, progress, sourceId) }
