package de.smartsquare.openclose.chocolate

import de.smartsquare.openclose.Ball
import de.smartsquare.openclose.annotations.InlinedBall

@InlinedBall
data class ChocolateBall(override val diameter: Float, val chunks: Boolean = false) : Ball(diameter)
