package de.smartsquare.openclose.cup

import de.smartsquare.openclose.BallAggregate
import de.smartsquare.openclose.topping.ChocolateSprinkles
import de.smartsquare.openclose.topping.Cream
import de.smartsquare.openclose.topping.RainbowSprinkles

data class Cup(
    val balls: BallAggregate,
    val cream: Cream?,
    val chocolateSprinkles: ChocolateSprinkles?,
    val rainbowSprinkles: RainbowSprinkles?,
)
