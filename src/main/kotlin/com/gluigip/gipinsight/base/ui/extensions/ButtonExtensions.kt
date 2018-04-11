package com.gluigip.gipinsight.base.ui.extensions

import com.gluigip.gipinsight.base.ui.contants.ButtonTheme
import com.vaadin.flow.component.HasClickListeners
import com.vaadin.flow.component.HasComponents
import com.vaadin.flow.component.button.Button

fun HasComponents.button(addToParent: Boolean = true): Button {
    return add(Button(), addToParent)
}

infix fun <BUTTON : Button> BUTTON.action(action: (event: HasClickListeners.ClickEvent<Button>) -> Unit): BUTTON {
    addClickListener({ action.invoke(it) })
    return this
}

infix fun <COMPONENT : Button> COMPONENT.theme(theme: ButtonTheme): COMPONENT {
    theme(theme.value)
    return this
}


//infix fun <BUTTON : Button> BUTTON.shortcut(shortcut: Int): BUTTON {
//    setClickShortcut(shortcut)
//    return this
//}
