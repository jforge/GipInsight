package com.gluigip.gipinsight.base.ui.extensions

import com.vaadin.flow.component.Component
import com.vaadin.flow.component.HasComponents
import com.vaadin.flow.component.HasValue
import com.vaadin.flow.component.datepicker.DatePicker
import com.vaadin.flow.component.html.Label
import com.vaadin.flow.component.textfield.TextArea
import com.vaadin.flow.component.textfield.TextField


infix fun <HAS_VALUE : HasValue<*, T>, T> HAS_VALUE.value(value: T): HAS_VALUE {
    this.value = value
    return this
}

//fun <HAS_VALUE : HasValue<*, T>, T> HAS_VALUE.bind(binder: Binder<T>, fieldNAme: KProperty1<T, *>): HAS_VALUE {
//    return bind(binder, fieldNAme.name)
//}
//
//infix fun <HAS_VALUE : HasValue<*>, T> HAS_VALUE.bind(field: Field<T>): HAS_VALUE {
//    return bind(field.binder, field.fieldNAme.name)
//}
//
//
//fun <HAS_VALUE : HasValue<*>> HAS_VALUE.bind(binder: Binder<*>, fieldNAme: String): HAS_VALUE {
//    binder.forField(this).bind(fieldNAme)
//    return this
//}

infix fun <HAS_VALUE : HasValue<COMPONENT, VALUE_TYPE>, COMPONENT : Component, VALUE_TYPE> HAS_VALUE.valueListener(
        listener: (event: HasValue.ValueChangeEvent<COMPONENT, VALUE_TYPE>) -> Unit): HAS_VALUE {
    addValueChangeListener(listener)
    return this
}

fun HasComponents.textArea(addToParent: Boolean = true): TextArea {
    return add(TextArea(), addToParent) fullWidth true
}

fun HasComponents.textField(addToParent: Boolean = true): TextField {
    return add(TextField(), addToParent) fullWidth true
}

infix fun <TEXT_FIELD : TextField> TEXT_FIELD.placeHolder(placeHolder: String): TEXT_FIELD {
    this.placeholder = placeHolder
    return this
}

infix fun <TEXT_FIELD : TextField> TEXT_FIELD.label(label: String): TEXT_FIELD {
    this.label = label
    return this
}
fun HasComponents.dateTimeField(addToParent: Boolean = true): DatePicker {
    return add(DatePicker(), addToParent) fullWidth true
}

fun HasComponents.label(addToParent: Boolean = true): Label {
    return add(Label(), addToParent)
}

//fun HasComponents.h1(addToParent: Boolean = true): Label {
//    return label(addToParent) style Vaadin.LABEL_H1)
//}
//
//fun HasComponents.h2(addToParent: Boolean = true): MLabel {
//    return label(addToParent).withStyleName(ValoTheme.LABEL_H2)
//}

//infix fun <COMPONENT : Label> COMPONENT.caption(caption: String): COMPONENT {
//    this.value = caption
//    return this
//}

//class Field<T>(val binder: Binder<*>, val fieldNAme: KProperty1<T, *>)