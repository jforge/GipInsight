package com.gluigip.gipinsight.base.ui.extensions

import com.vaadin.flow.component.HasComponents
import com.vaadin.flow.component.dialog.Dialog
import com.vaadin.flow.component.formlayout.FormLayout
import com.vaadin.flow.component.html.Div
import com.vaadin.flow.component.orderedlayout.HorizontalLayout
import com.vaadin.flow.component.orderedlayout.ThemableLayout
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.component.splitlayout.SplitLayout

infix fun <LAYOUT : ThemableLayout> LAYOUT.hasMargin(hasMargin: Boolean): LAYOUT {
    isMargin = hasMargin
    return this
}

//infix fun <COMPONENT : Layout.MarginHandler> COMPONENT.margin(margin: MarginInfo): COMPONENT {
//    setMargin(margin)
//    return this
//}

infix fun <COMPONENT : ThemableLayout> COMPONENT.hasSpacing(hasSpacing: Boolean): COMPONENT {
    isSpacing = hasSpacing
    return this
}

infix fun <COMPONENT : ThemableLayout> COMPONENT.hasPadding(hasPadding: Boolean): COMPONENT {
    isPadding = hasPadding
    return this
}

fun HasComponents.verticalLayout(addToParent: Boolean = true): VerticalLayout {
    return add(VerticalLayout(), addToParent)
}

fun HasComponents.formLayout(addToParent: Boolean = true): FormLayout {
    return add(FormLayout(), addToParent)
}

fun HasComponents.horizontalLayout(addToParent: Boolean = true): HorizontalLayout {
    return add(HorizontalLayout(), addToParent)
}

fun HasComponents.div(addToParent: Boolean = true): Div {
    return add(Div(), addToParent)
}

fun HasComponents.splitLayout(addToParent: Boolean = true): SplitLayout {
    return add(SplitLayout(), addToParent)
}

fun HasComponents.dialog(addToParent: Boolean = false): Dialog {
    return add(Dialog(), addToParent)
}