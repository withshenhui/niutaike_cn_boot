package com.vless.data.content.model

import com.vless.data.common.BaseEntity
import com.vless.data.content.enum.NewsTypeEnum
import javax.persistence.*
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

@Entity
@Table(name="ntk_product")
class Product : BaseEntity() {

    @Column(name="title")
    @NotEmpty
    var title:String? = null

    @Column(name="intro")
    @NotEmpty
    var intro:String? = null

    @Column(name="detail")
    @NotEmpty
    var detail:String? = null

    @Column(name="logo")
    var logo:String? = null

    @Column(name="show_index")
    @NotNull
    var showIndex:Boolean = true

}