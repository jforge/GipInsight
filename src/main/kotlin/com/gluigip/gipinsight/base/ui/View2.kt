package com.gluigip.gipinsight.base.ui

import com.gluigip.gipinsight.base.ui.contants.ButtonTheme
import com.gluigip.gipinsight.base.ui.extensions.*
import com.vaadin.flow.component.html.Div
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.router.Route

@Route("2", layout = MainUI::class)
class View2 : Div() {

    init {
        fullSize(true)
        verticalLayout() has {
            label() text "Hello View 2"
            textField() label "Text1"
            button() text "Primary" theme ButtonTheme.PRIMARY
        }
    }
}