package com.klondike.movies.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.klondike.movies.data.api.model.ApiMovie


@Composable
fun MovieItem(
    movie: ApiMovie,
    modifier: Modifier = Modifier,
    onMovieClick: (ApiMovie) -> Unit,
) {

    Card(
        modifier = Modifier
            .padding(8.dp)
            .height(300.dp)
            .clickable { onMovieClick.invoke(movie) }
    ) {
        Column {
            Modifier
                .padding(16.dp)
                .fillMaxSize()

            Text(
                text = movie.title,
                style = MaterialTheme.typography.h6.copy(fontWeight = FontWeight.SemiBold),
                textAlign = TextAlign.Center
            )

            Divider(thickness = 2.dp)
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
                    .padding(8.dp),
                elevation = 4.dp
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.Start
                ) {
                    Image(
                        painter = rememberAsyncImagePainter(movie.image),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxWidth()


                    )
                }

            }

        }


    }

}