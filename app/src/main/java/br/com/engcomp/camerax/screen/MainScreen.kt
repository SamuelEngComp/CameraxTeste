package br.com.engcomp.camerax.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun MainScreen(){
    Greeting("Alex SIAC E SISCON")
}




@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Column {
        Text(
            text = "Hello world $name!",
            modifier = modifier
        )
    }


}