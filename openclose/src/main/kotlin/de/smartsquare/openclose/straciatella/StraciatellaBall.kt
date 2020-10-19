package de.smartsquare.openclose.straciatella

import de.smartsquare.openclose.Ball
import de.smartsquare.openclose.annotations.InlinedBall

@InlinedBall
data class StraciatellaBall(override val diameter: Float) : Ball(diameter)
