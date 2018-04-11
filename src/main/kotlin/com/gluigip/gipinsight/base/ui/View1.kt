package com.gluigip.gipinsight.base.ui

import com.vaadin.flow.component.html.Div
import com.vaadin.flow.router.Route

@Route("1", layout = MainUI::class)
class View1 : Div() {
    init {
        text = "Hello View 2"
    }
}