package com.uwan.stockmaster.data.maper

import com.uwan.stockmaster.data.room.CompanyListingEntity
import com.uwan.stockmaster.data.remote.dto.CompanyInfoDto
import com.uwan.stockmaster.domain.model.CompanyInfo
import com.uwan.stockmaster.domain.model.CompanyListItem


fun CompanyListingEntity.toCompanyListing(): CompanyListItem {
    return CompanyListItem(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListItem.toCompanyListingEntity(): CompanyListingEntity {
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyInfoDto.toCompanyInfo(): CompanyInfo {
    return CompanyInfo(
        symbol = symbol ?: "",
        description = description ?: "",
        name = name ?: "",
        country = country ?: "",
        industry = industry ?: ""
    )
}