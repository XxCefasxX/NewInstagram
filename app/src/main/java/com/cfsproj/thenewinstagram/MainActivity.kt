package com.cfsproj.thenewinstagram

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.cfsproj.thenewinstagram.ui.postsBody
import com.cfsproj.thenewinstagram.ui.storiesBar
import com.cfsproj.thenewinstagram.ui.theme.TheNewInstagramTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TheNewInstagramTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
                        val (stories, posts) = createRefs()
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(60.dp)
                                .constrainAs(stories) {
                                }
                        ) {
                            storiesBar()
                        }
                        Box(modifier = Modifier
                            .fillMaxHeight()
                            .constrainAs(posts) {
                                top.linkTo(stories.bottom)
                                bottom.linkTo(parent.bottom)
                            }
                        ) {
                            postsBody()
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TheNewInstagramTheme {
        Greeting("Android")
    }
}