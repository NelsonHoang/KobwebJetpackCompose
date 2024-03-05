package com.omega.san.components

import androidx.compose.runtime.Composable
import com.omega.san.model.Theme
import com.omega.san.style.InputStyle
import com.omega.san.style.MainButtonStyle
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*

@Composable
fun ContactForm(breakpoint: Breakpoint) {
    Form(
        action = ""
    ) {
        Label(
            attrs = Modifier
                .classNames("form-label")
                .toAttrs(),
            forId = INPUT_NAME_ID
        ) {
            Text("Name")
        }
        Input(
            type = InputType.Text,
            attrs = InputStyle.toModifier()
                .id(INPUT_NAME_ID)
                .classNames("form-control")
                .margin(bottom = 10.px)
                .width(
                    if (breakpoint >= Breakpoint.MD) 500.px
                    else 250.px
                )
                .backgroundColor(Theme.LightGray.rgb)
                .boxShadow(
                    offsetX = 0.px,
                    offsetY = 0.px,
                    blurRadius = 0.px,
                    color = null
                )
                .attrsModifier {
                    attr("placeholder", "Full Name")
                    attr("required", "true")
                }
                .toAttrs()
        )
        Label(
            attrs = Modifier
                .classNames("form-label")
                .toAttrs(),
            forId = INPUT_EMAIL_ID
        ) {
            Text("Email")
        }
        Input(
            type = InputType.Email,
            attrs = InputStyle.toModifier()
                .id(INPUT_EMAIL_ID)
                .classNames("form-control")
                .margin(bottom = 10.px)
                .width(
                    if (breakpoint >= Breakpoint.MD) 500.px
                    else 250.px
                )
                .backgroundColor(Theme.LightGray.rgb)
                .boxShadow(
                    offsetX = 0.px,
                    offsetY = 0.px,
                    blurRadius = 0.px,
                    color = null
                )
                .attrsModifier {
                    attr("placeholder", "Email Address")
                    attr("required", "true")
                }
                .toAttrs()
        )
        Label(
            attrs = Modifier
                .classNames("form-label")
                .toAttrs()
        ) {
            Text("Message")
        }
        TextArea(
            attrs = InputStyle.toModifier()
                .id(INPUT_MESSAGE_ID)
                .classNames("form-control")
                .height(150.px)
                .margin(bottom = 20.px)
                .width(
                    if (breakpoint >= Breakpoint.MD) 500.px
                    else 250.px
                )
                .backgroundColor(Theme.LightGray.rgb)
                .boxShadow(
                    offsetX = 0.px,
                    offsetY = 0.px,
                    blurRadius = 0.px,
                    color = null
                )
                .attrsModifier {
                    attr("placeholder", "Your Message")
                    attr("required", "true")
                }
                .toAttrs()
        )
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Button(
                attrs = MainButtonStyle.toModifier()
                    .height(40.px)
                    .border(width = 0.px)
                    .borderRadius(r = 5.px)
                    .backgroundColor(Theme.Primary.rgb)
                    .color(Colors.White)
                    .cursor(Cursor.Pointer)
                    .toAttrs()
            ) {
                Text("Submit")
            }
        }

    }
}

private const val INPUT_EMAIL_ID = "inputEmail"
private const val INPUT_MESSAGE_ID = "inputMessage"
private const val INPUT_NAME_ID = "inputName"