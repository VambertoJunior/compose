package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText()
                }
            }
        }
    }
}

@Composable
fun GreetingText(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            CustomText(
                backgroundColor = Color(0xFFEADDFF),
                titulo = "Text Composable",
                descricao = "Displays text and follows the recommended Material Design guidelines",
                modifier = Modifier.weight(1f)
            )
            CustomText(
                backgroundColor = Color(0xFFD0BCFF),
                titulo = "Image Composable",
                descricao = "Creates a composable that lays out and draws a given Painter class object.",
                modifier = Modifier.weight(1f)
            )
        }
        Row(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            CustomText(
                backgroundColor = Color(0xFFB69DF8),
                titulo = "Row Composable",
                descricao = "A layout composable that places its children in a horizontal sequence",
                modifier = Modifier.weight(1f)
            )
            CustomText(
                backgroundColor = Color(0xFFF6EDFF),
                titulo = "Column Composable",
                descricao = "A layout composable that places its children in a vertical sequence",
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun CustomText(
    backgroundColor: Color,
    titulo: String,
    descricao: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = titulo,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = descricao,
            fontSize = 15.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewGreetingText() {
    ComposeTheme {
        GreetingText()
    }
}