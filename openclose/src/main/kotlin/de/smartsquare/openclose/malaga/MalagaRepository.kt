package de.smartsquare.openclose.malaga

class MalagaRepository {

    fun scrapeBall(): MalagaBall {
        // definitely NO raisins!
        return MalagaBall(1.25F, false)
    }
}
