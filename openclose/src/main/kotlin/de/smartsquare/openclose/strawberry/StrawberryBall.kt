package de.smartsquare.openclose.strawberry

import de.smartsquare.openclose.Ball
import de.smartsquare.openclose.annotations.InlinedBall

@InlinedBall
data class StrawberryBall(override val diameter: Float) : Ball(diameter)
