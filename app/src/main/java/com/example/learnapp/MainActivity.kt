package com.example.learnapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learnapp.ui.theme.LearnAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent{
            LearnAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting1(
                        name = "Jetpack Compose tutorial",
                        modifier = Modifier.padding(innerPadding)
                    )
                    Greeting2(
                        name = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
                        modifier = Modifier.padding(innerPadding)
                    )
                    Greeting3(
                        name = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting1(name: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        GreetingImage("Background Image")
        Text(
            text = name,
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp,
        )
    }
}
@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    Text(
        text = name,
        modifier = modifier
            .padding(vertical = 160.dp)
            .absolutePadding(left = 16.dp, right = 16.dp),
        textAlign = TextAlign.Justify,
    )
}
@Composable
fun Greeting3(name: String, modifier: Modifier = Modifier) {
    Text(
        text = name,
        modifier = modifier
            .padding(vertical = 225.dp)
            .absolutePadding(left = 16.dp, right = 16.dp, top = 16.dp, bottom = 16.dp),
        textAlign = TextAlign.Justify,
    )
}
@Composable
fun GreetingImage( message: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)

    Image(
        painter = image,
        contentDescription = message,
        modifier = modifier
    )

}




@Preview(showBackground = true)
@Composable
fun GreetingText(){
    Greeting1(  "Jetpack Compose tutorial")
    Greeting2("Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.")
    Greeting3("In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.")
}


