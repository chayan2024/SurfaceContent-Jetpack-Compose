package com.withjetpack.surfacecontent_jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.withjetpack.surfacecontent_jetpack_compose.ui.theme.SurfaceContentJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SurfaceContentJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.onSecondary,
                    shape = RoundedCornerShape(10.dp),
                    contentColor = Color(0xFFFDD835)
                ) {
                    ContentText("Welcome to Jetpack compose surface implementation")
                }
            }
        }
    }
}

@Composable
fun ContentText(name: String) {
    Text(text = "Hello $name!", fontSize = 20.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(all = 5.dp))
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SurfaceContentJetpackComposeTheme {
        ContentText("Android")
    }
}