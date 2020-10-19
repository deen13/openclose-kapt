package de.smartsquare.openclose.malaga

import de.smartsquare.openclose.Ball
import de.smartsquare.openclose.annotations.InlinedBall

@InlinedBall
data class MalagaBall(override val diameter: Float, val raisins: Boolean) : Ball(diameter)
