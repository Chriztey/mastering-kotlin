package com.chris.mastering_kotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.chris.mastering_kotlin.ui.theme.MasteringkotlinTheme


// Testing printOut double & float value
var circleRatio = 3.14
var circleRatioFloat = 3.145678f //max float decimal digits are 7

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            MasteringkotlinTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Android")
                    printTestDoubleFloat()
                }
            }

        }


    }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier

    )

}

fun printTestDoubleFloat(){
    (println(circleRatio))
    (println(circleRatioFloat))
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MasteringkotlinTheme {
        Greeting("Android")
    }
}