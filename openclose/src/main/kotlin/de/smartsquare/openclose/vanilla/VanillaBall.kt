package de.smartsquare.openclose.vanilla

import de.smartsquare.openclose.Ball
import de.smartsquare.openclose.annotations.InlinedBall

@InlinedBall
data class VanillaBall(override val diameter: Float) : Ball(diameter)
