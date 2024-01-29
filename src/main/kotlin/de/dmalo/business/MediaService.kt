package de.dmalo.business

import de.dmalo.mediarepository.model.BinaryFileResource
import de.dmalo.mediarepository.model.types.CategoryType
import de.dmalo.mediarepository.model.types.MimeType

interface MediaService {
    fun has(mimeType: MimeType, resourceName: String): Boolean

    fun get(mimeType: MimeType, resourceName: String): BinaryFileResource

    fun getAll(): List<BinaryFileResource>

    fun getByMimeType(mimeType: MimeType): List<BinaryFileResource>

    fun getByCategory(category: CategoryType): List<BinaryFileResource>

    fun getByTag(tag: String): List<BinaryFileResource>

    fun create(binaryFileResource: BinaryFileResource)

    fun createOrReplace(binaryFileResource: BinaryFileResource)

    fun delete(mimeType: MimeType, resourceName: String)

    fun listAllFilePaths(): List<String>

    fun listFilePathsByCategory(category: CategoryType): List<String>

    fun listFilePathsByMimeType(mimeType: MimeType): List<String>
}
