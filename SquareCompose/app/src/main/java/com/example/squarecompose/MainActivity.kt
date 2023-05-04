package com.example.squarecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.squarecompose.ui.theme.SquareComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SquareComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SquareComposableScreen("Android")
                }
            }
        }
    }
}

@Composable
fun SquareComposableApp(modifier: Modifier = Modifier) {
    SquareComposableScreen(
        titleTextComposable = stringResource(R.string.text_composable_title),
        descriptionTextComposable = stringResource(R.string.text_composable_desc),
        titleImageComposable = stringResource(R.string.image_composable_title),
        descriptionImageComposable = stringResource(R.string.image_composable_desc),
        titleRowComposable = stringResource(R.string.row_composable_title),
        descriptionRowComposable = stringResource(R.string.row_composable_desc),
        titleColumnComposable = stringResource(R.string.column_composable_title),
        descriptionColumnComposable = stringResource(R.string.column_composable_desc)
    )
}

@Composable
fun SquareComposableScreen(
    titleTextComposable: String,
    descriptionTextComposable: String,
    titleImageComposable: String,
    descriptionImageComposable: String,
    titleRowComposable: String,
    descriptionRowComposable: String,
    titleColumnComposable: String,
    descriptionColumnComposable: String,
    modifier: Modifier = Modifier
) {

}

@Preview(showBackground = true)
@Composable
fun SquareComposePreview() {
    SquareComposeTheme {
        SquareComposableScreen("Android")
    }
}