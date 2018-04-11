package com.gluigip.gipinsight.base.ui

import com.gluigip.gipinsight.base.ui.extensions.*
import com.vaadin.flow.component.HasElement
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.router.RouterLayout

class MainUI : VerticalLayout(), RouterLayout {

    private lateinit var content: VerticalLayout

    init {
        fullSize(true) hasMargin false hasSpacing false hasPadding false
        label() text "Menu"
        content = verticalLayout() fullSize true hasMargin false hasSpacing false hasPadding false
        label() text "Footer" has {
            style
        }
    }

    override fun showRouterLayoutContent(content: HasElement?) {
        this.content.apply {
            removeAll()
            element.appendChild(content!!.element)
        }
    }
}