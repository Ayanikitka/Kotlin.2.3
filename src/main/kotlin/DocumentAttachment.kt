data class DocumentAttachment(
    override val type: String = "",
    val document: Document = Document()
) : Attachment