package ayds.newyork.songinfo.moredetails.model.entities

interface Artist {
    val artistName: String
    val artistInfo: String
    val artistUrl: String
    var isLocallyStored: Boolean
}

data class ArtistInfo(
    override val artistName: String,
    override val artistInfo: String,
    override val artistUrl: String,
    override var isLocallyStored: Boolean = false
) : Artist

object EmptyArtist : Artist {
    override val artistName: String = ""
    override val artistInfo: String = ""
    override val artistUrl: String = ""
    override var isLocallyStored: Boolean = false
}