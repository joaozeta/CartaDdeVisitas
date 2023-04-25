package com.example.cartaodevisitas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartaodevisitas.ui.theme.CartaoDeVisitasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartaoDeVisitasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Black
                ) {
                    Lagum()
                }
            }
        }
    }
}

@Composable
fun Lagum() {
   Image(
       painter = painterResource(id = R.drawable.fundo2),
       contentDescription = null,
       contentScale = ContentScale.Crop
   )
    Cabecalho()
    Rodape()
}

@Composable
fun Rodape() {
    Column(
        modifier = Modifier
            .padding(start = 130.dp),
        verticalArrangement = Arrangement.Bottom
    ) {
        Contato(R.drawable.lagumlogo, textoCtt = "@lagumoficial")
        Contato()
        Contato()
    }
}

@Composable
fun Contato(caminhoIagem: Int, textoCtt : String) {

    Row(
        modifier = Modifier
            .padding(vertical = 5.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.lagumlogo),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(30.dp)
        )
        Text(
            text = "@lagumoficial",
            fontSize = 15.sp,
            fontWeight = FontWeight.ExtraBold
        )
    }
}

@Composable
fun Cabecalho() {
    Column(
        modifier = Modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.lagumlogo),
            contentDescription = null,
        )
        Text(
            text = "Lagum",
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Default
        )
        Text(
            text = "Depois do Fim",
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic,
            fontFamily = FontFamily.Default
        )
    }
}
