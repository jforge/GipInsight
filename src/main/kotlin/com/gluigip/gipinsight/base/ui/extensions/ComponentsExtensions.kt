package com.gluigip.gipinsight.base.ui.extensions

import com.vaadin.flow.component.*
import com.vaadin.flow.component.orderedlayout.FlexComponent
import com.vaadin.flow.component.orderedlayout.HorizontalLayout
import com.vaadin.flow.component.orderedlayout.VerticalLayout

fun <COMPONENT : Component> HasComponents.add(component: COMPONENT, addToParent: Boolean = true): COMPONENT {
    if (addToParent) add(component)
    return component
}

private fun HasComponents.add(component: Component) = {
    this.add(component)
}


infix fun <COMPONENT : Component> COMPONENT.has(init: COMPONENT.() -> Unit): COMPONENT {
    init.invoke(this)
    return this
}

infix fun <COMPONENT : Component> COMPONENT.align(alignment: FlexComponent.Alignment): COMPONENT {
    (parent as? FlexComponent<*>)?.align(this, alignment)
    return this
}

private fun <COMPONENT : Component> HasComponents.align(component: COMPONENT, alignment: FlexComponent.Alignment?): COMPONENT {
    when (this) {
        is VerticalLayout -> setHorizontalComponentAlignment(alignment, component)
        is HorizontalLayout -> setVerticalComponentAlignment(alignment, component)
    }
    return component
}

infix fun <COMPONENT : HasSize> COMPONENT.width(width: String): COMPONENT {
    setWidth(width)
    return this
}

infix fun <COMPONENT : HasSize> COMPONENT.width(width: Float): COMPONENT {
    setWidth("${width}px")
    return this
}

infix fun <COMPONENT : HasSize> COMPONENT.fullWidth(fullWidth: Boolean): COMPONENT {
    width = if (fullWidth) "100%" else null
    return this
}

infix fun <COMPONENT : HasSize> COMPONENT.height(height: String): COMPONENT {
    setHeight(height)
    return this
}

infix fun <COMPONENT : HasSize> COMPONENT.height(height: Float): COMPONENT {
    setHeight("${height}px")
    return this
}

infix fun <COMPONENT : HasSize> COMPONENT.fullHeight(fullHeight: Boolean): COMPONENT {
    height = if (fullHeight) "100%" else null
    return this
}


infix fun <COMPONENT : HasSize> COMPONENT.fullSize(fullSize: Boolean): COMPONENT {
    if (fullSize) setSizeFull() else setSizeUndefined()
    return this
}

infix fun <COMPONENT : HasText> COMPONENT.text(text: String): COMPONENT {
    this.text = text
    return this
}

//infix fun <COMPONENT : HasStyle> COMPONENT.style(style: String): COMPONENT {
//    this.add(style)
//    return this
//}

infix fun <COMPONENT : Component> COMPONENT.theme(theme: String): COMPONENT {
    element.setAttribute("theme", "${element.getAttribute("theme") ?: ""} $theme")
    return this
}

infix fun <COMPONENT : Focusable<*>> COMPONENT.focus(focus: Boolean): COMPONENT {
    if (focus) focus()
    return this
}


infix fun <COMPONENT : Component> COMPONENT.expand(expand: Boolean): COMPONENT {
    if (expand && this.parent is FlexComponent<*>) {
        (this.parent as FlexComponent<*>).expand(this)
    }
    return this
}

//infix fun <COMPONENT : Component> COMPONENT.isEnable(isEnable: Boolean): COMPONENT {
//    this.isEnabled = isEnable
//    return this
//}

//infix fun <COMPONENT : Component> COMPONENT.icon(icon: Resource): COMPONENT {
//    this.icon = icon
//    return this
//}
