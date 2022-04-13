data class ImageAttachment(
    override val type: String = "",
    val image: Image = Image()
) : Attachment