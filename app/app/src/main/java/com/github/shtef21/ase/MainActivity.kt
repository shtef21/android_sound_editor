package com.github.shtef21.ase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.github.shtef21.ase.ui.theme.AndroidSoundEditorTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      AndroidSoundEditorTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
          Column(modifier = Modifier.fillMaxSize()) {
            Box(
              modifier = Modifier
                .weight(1f)
                .background(Color.Blue)
                .fillMaxWidth(),
              contentAlignment = Alignment.Center
            ) {
              Button(onClick = {}) {
                Text("Audio edit")
              }
            }
            Box(
              modifier = Modifier
                .weight(1f)
                .background(Color.Red)
                .fillMaxWidth(),
              contentAlignment = Alignment.Center
            ) {
              Button(onClick = {}) {
                Text("Video sound improve")
              }
            }
          }
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

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
  AndroidSoundEditorTheme {
    Greeting("Android")
  }
}