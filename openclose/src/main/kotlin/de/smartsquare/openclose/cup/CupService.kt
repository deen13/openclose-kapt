package de.smartsquare.openclose.cup

import de.smartsquare.openclose.Ball
import de.smartsquare.openclose.BallAggregate
import de.smartsquare.openclose.topping.ChocolateSprinkles
import de.smartsquare.openclose.topping.Cream
import de.smartsquare.openclose.topping.RainbowSprinkles

class CupService {

    // Darn! This function has too many parameters! Please refactor.
    fun fillCup(
        balls: List<Ball>,
        cream: Cream? = null,
        chocolateSprinkles: ChocolateSprinkles? = null,
        rainbowSprinkles: RainbowSprinkles? = null
    ): Cup {
        return Cup(BallAggregate.create(balls), cream, chocolateSprinkles, rainbowSprinkles)
    }
}
