package com.github.assemblyDir.paperKotlin

import net.kyori.adventure.key.Key
import org.bukkit.Registry
import org.bukkit.entity.LivingEntity
import org.bukkit.entity.Player
import org.bukkit.potion.PotionEffect

/**
 * Adds a potion effect to the living entity.
 *
 * @receiver [LivingEntity] instance
 * @param name [Key] of the potion effect type
 * @param duration Duration of the effect in ticks
 * @param amplifier Amplifier of the effect
 * @param hide Whether to hide the effect from the player if they are the target
 */
fun LivingEntity.potionEffect(
    name: Key,
    duration: Int,
    amplifier: Int,
    hide: Boolean = false,
) {
    val potionEffectType = Registry.POTION_EFFECT_TYPE.get(name) ?: throw IllegalArgumentException("Potion effect $name not recognized!")
    addPotionEffect(PotionEffect(potionEffectType, duration, amplifier))
    if (hide) (this as? Player)?.sendPotionEffectChangeRemove(this, potionEffectType)
}

/**
 * Adds a potion effect to the living entity.
 *
 * @receiver [LivingEntity] instance
 * @param name [Key] of the potion effect type
 * @param duration Duration of the effect in ticks
 * @param amplifier Amplifier of the effect
 * @param ambient Whether the effect is ambient
 * @param hide Whether to hide the effect from the player if they are the target
 */
fun LivingEntity.potionEffect(
    name: Key,
    duration: Int,
    amplifier: Int,
    ambient: Boolean,
    hide: Boolean = false,
) {
    val potionEffectType = Registry.POTION_EFFECT_TYPE.get(name) ?: throw IllegalArgumentException("Potion effect $name not recognized!")
    addPotionEffect(PotionEffect(potionEffectType, duration, amplifier, ambient))
    if (hide) (this as? Player)?.sendPotionEffectChangeRemove(this, potionEffectType)
}

/**
 * Adds a potion effect to the living entity.
 *
 * @receiver [LivingEntity] instance
 * @param name [Key] of the potion effect type
 * @param duration Duration of the effect in ticks
 * @param amplifier Amplifier of the effect
 * @param ambient Whether the effect is ambient
 * @param particles Whether the effect has particles
 * @param hide Whether to hide the effect from the player if they are the target
 */
fun LivingEntity.potionEffect(
    name: Key,
    duration: Int,
    amplifier: Int,
    ambient: Boolean,
    particles: Boolean,
    hide: Boolean = false,
) {
    val potionEffectType = Registry.POTION_EFFECT_TYPE.get(name) ?: throw IllegalArgumentException("Potion effect $name not recognized!")
    addPotionEffect(PotionEffect(potionEffectType, duration, amplifier, ambient, particles))
    if (hide) (this as? Player)?.sendPotionEffectChangeRemove(this, potionEffectType)
}

/**
 * Adds a potion effect to the living entity.
 *
 * @receiver [LivingEntity] instance
 * @param name [Key] of the potion effect type
 * @param duration Duration of the effect in ticks
 * @param amplifier Amplifier of the effect
 * @param ambient Whether the effect is ambient
 * @param particles Whether the effect has particles
 * @param icon Whether the effect has an icon
 * @param hide Whether to hide the effect from the player if they are the target
 */
fun LivingEntity.potionEffect(
    name: Key,
    duration: Int,
    amplifier: Int,
    ambient: Boolean,
    particles: Boolean,
    icon: Boolean,
    hide: Boolean = false,
) {
    val potionEffectType = Registry.POTION_EFFECT_TYPE.get(name) ?: throw IllegalArgumentException("Potion effect $name not recognized!")
    addPotionEffect(PotionEffect(potionEffectType, duration, amplifier, ambient, particles, icon))
    if (hide) (this as? Player)?.sendPotionEffectChangeRemove(this, potionEffectType)
}